const http = require('http')
var dt = require('./calc')
const { setUncaughtExceptionCaptureCallback } = require('process')
const hostname = 'localhost'
const port = 3000
const server = http.createServer((req, res)=>{
    res.statusCode=200
    res.setHeader("Content-Type","text/html")   
    res.write("Add " + dt.calc(10,20,'+'))
    console.log(dt.calc(10,20,'+'))
    console.log(dt.calc(10,20,'-'))
    console.log(dt.calc(10,20,'*'))
    console.log(dt.calc(10,20,'/'))
    res.end();
})

server.listen(port,hostname,()=>{console.log(`Server http://${hostname}:${port}`)})
