const fs = require('fs')
// READ FILE - fs.readFile()
// fs.readFile('./lorem.txt', (err, data) => {
//     if(err){
//         return console.log('error occurred while reading file')
//     }
//     console.log(data.toString())
// })

//READ FILE - fs.readFileSync()
// const data = fs.readFileSync('./lorem.txt')
// console.log(data.toString())

//OPEN FILE - fs.open()
// fs.open('Hello.txt', 'w', (err, file) => {
//     if(err){
//         throw err
//     }
//     console.log('Saved!')
// })

//WRITE FILE - fs.writeFile()
// fs.writeFile('file.txt', 'Hello World', (err) => {
//     if(err){
//         throw err
//     }
//     console.log('Saved')
// })

//APPEND FILE - fs.appendFile()
// fs.appendFile('file.txt', ' My name is Khoi', (err) => {
//     if(err){
//         throw err
//     }
//     console.log('Updated')
// })

//COPY FILE - fs.copyFile()
// fs.copyFile('file.txt', 'copyfile.txt', (err) => {
//     if(err){
//         throw err
//     }
//     console.log('File copied')
// })

//UNLINK/REMOVE FILE - fs.unlink()
// fs.unlink('lorem.txt', (err) => {
//     if(err){
//         throw err
//     }
//     console.log('File deleted')
// })

//RENAME - fs.rename()
// fs.rename('file.txt', 'newFile.txt', (err) => {
//     if(err){
//         throw err
//     }
//     console.log('File renamed')
// })