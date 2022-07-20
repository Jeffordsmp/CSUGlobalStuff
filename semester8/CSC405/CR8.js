const m4 = twgl.m4;
const gl = document.querySelector("canvas").getContext("webgl");
const vs = `
attribute vec4 position;
varying vec4 v_position;
uniform mat4 matrix;
void main() {
   gl_Position = matrix * position;
   v_position = abs(position);
}
`;
const fs = `
precision mediump float;
varying vec4 v_position;
uniform vec4 color;
void main() {
  gl_FragColor = vec4(1. - v_position.xxx, 1) * color;
}
`;
// compiles shaders, links program, looks up attributes
const programInfo = twgl.createProgramInfo(gl, [vs, fs]);
// calls gl.createBuffer, gl.bindBindbuffer, gl.bufferData for each array
const z0To1BufferInfo = twgl.createBufferInfoFromArrays(gl, {
  position: [ 
     ...makeQuad( .2, 0.00),
     ...makeQuad( .4,  .25),
     ...makeQuad( .6,  .50),
     ...makeQuad( .8,  .75),
     ...makeQuad(1.0, 1.00),
  ],
});
const z1To0BufferInfo = twgl.createBufferInfoFromArrays(gl, {
  position: [ 
     ...makeQuad(.2, 1.00),
     ...makeQuad(.4,  .75),
     ...makeQuad(.6,  .50),
     ...makeQuad(.8,  .25),
     ...makeQuad(1., 0.00),
  ],
});

function makeQuad(xy, z) {
  return [
     -xy, -xy, z,
      xy, -xy, z,
     -xy,  xy, z,
     -xy,  xy, z,
      xy, -xy, z,
      xy,  xy, z,
  ];
}

gl.useProgram(programInfo.program);

gl.enable(gl.DEPTH_TEST);

gl.clearDepth(1);
gl.clear(gl.DEPTH_BUFFER_BIT);
gl.depthFunc(gl.LESS);
drawRects(-0.66, z0To1BufferInfo, [1, 0, 0, 1]);

gl.clearDepth(0);
gl.clear(gl.DEPTH_BUFFER_BIT);
gl.depthFunc(gl.GEQUAL);
drawRects(0, z1To0BufferInfo, [0, 1, 0, 1]);

gl.clearDepth(1);
gl.clear(gl.DEPTH_BUFFER_BIT);
gl.depthFunc(gl.GEQUAL);
drawRects(0.66, z1To0BufferInfo, [0, 0, 1, 1]);


function drawRects(xoffset, bufferInfo, color) {
  // calls gl.bindBuffer, gl.enableVertexAttribArray, gl.vertexAttribPointer
  twgl.setBuffersAndAttributes(gl, programInfo, bufferInfo);
  
  let mat = m4.translation([xoffset, 0, 0]);
  mat = m4.scale(mat, [.3, .5, 1]);

  // calls gl.uniformXXX
  twgl.setUniforms(programInfo, {
    color: color,
    matrix: mat,
  });

  // calls gl.drawArrays or gl.drawElements
  twgl.drawBufferInfo(gl, bufferInfo);
}