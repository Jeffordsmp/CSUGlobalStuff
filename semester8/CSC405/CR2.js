// Serpinski Tirangle

const gl = document.querySelector('canvas').getContext('webgl');

const canvasWidthHeight = 600;
gl.clearColor(1, 1, 1, 1);
gl.clear(gl.COLOR_BUFFER_BIT);

const vertexShaderSource = `
  attribute vec2 position;

  void main() {
    gl_Position = vec4(position, 0, 1);
  }
`;

const fragmentShaderSource = `
  precision mediump float;
 
  void main() {
    gl_FragColor = vec4(0.7, 0.7, 0.9, 1.0);
  }
`;

function createShader(gl, type, shaderSource) {
  const shader = gl.createShader(type);
  gl.shaderSource(shader, shaderSource);
  gl.compileShader(shader);
  
  const success = gl.getShaderParameter(shader, gl.COMPILE_STATUS);
  if(!success) {
    console.warn(gl.getShaderInfoLog(shader));
    gl.deleteShader(shader);
  }

  return shader;
}

const vertexShader = createShader(gl, gl.VERTEX_SHADER, vertexShaderSource);
const fragmentShader = createShader(gl, gl.FRAGMENT_SHADER, fragmentShaderSource);

function createProgram(gl, vertexShader, fragmentShader) {
  const program = gl.createProgram();
  gl.attachShader(program, vertexShader);
  gl.attachShader(program, fragmentShader);
  gl.linkProgram(program);
  
  const success = gl.getProgramParameter(program, gl.LINK_STATUS);
  if(!success) {
    console.log(gl.getProgramInfoLog(program));
    gl.deleteProgram(program);
  }

  return program;
}

const program = createProgram(gl, vertexShader, fragmentShader);

const positionAttributeLocation = gl.getAttribLocation(program, 'position');

gl.useProgram(program);

const positionBuffer = gl.createBuffer();
gl.bindBuffer(gl.ARRAY_BUFFER, positionBuffer);
gl.enableVertexAttribArray(positionAttributeLocation);
gl.vertexAttribPointer(positionAttributeLocation, 2, gl.FLOAT, false, 0, 0);

// const EDGE_POINTS = [
//   [-1, -1],
//   [1, -1],
//   [0, 1]
// ]
let initialPoint = [0, 0];
let pointCount = 1000 * 800;

const EDGE_POINTS = [
  [-1, -1],
  [1, -1],
  [0, 1]
]

const pointList = [];
const recursiveDepth = 7;

function mix(pointA, pointB, mix) {
  return [
    pointA[0] * mix + pointB[0] * (1 - mix),
    pointA[1] * mix + pointB[1] * (1 - mix)
  ]
}

function generateTriangles(edgePoints, depth) {
  if(depth === 0) {
    pointList.push(...edgePoints[0]);
    pointList.push(...edgePoints[1]);
    return pointList.push(...edgePoints[2]);
  }
  const middlePointList = [
    mix(edgePoints[0], edgePoints[1], 0.5),
    mix(edgePoints[0], edgePoints[2], 0.5),
    mix(edgePoints[1], edgePoints[2], 0.5)
  ];
  depth--;
  generateTriangles([edgePoints[0], middlePointList[0], middlePointList[1]], depth);
  generateTriangles([edgePoints[1], middlePointList[0], middlePointList[2]], depth);
  generateTriangles([edgePoints[2], middlePointList[1], middlePointList[2]], depth);
}
generateTriangles(EDGE_POINTS, recursiveDepth)
gl.bufferData(gl.ARRAY_BUFFER, new Float32Array(pointList), gl.STATIC_DRAW);
gl.drawArrays(gl.TRIANGLES, 0, pointList.length / 2);
