/*min = 5 
max = 22
azar = Math.floor(min + (Math.random()) *(max-min+1))
document.write(azar)*/
/*function pideedad() {
    cadena = prompt("Inserte una frase")
    return(cadena)
}

frase = prompt("Inserte una frase")
frase2 = ""
for (let index = 0; index < frase.length; index++) {
    if (frase.at(index) != " ") {
        frase2 += frase[index]
    }
}
document.write("</br>" + frase2)

numero = parseInt(prompt("Introduce un número"))
no = 12
document.write("</br>")

if (isNaN(numero)) {
    document.write("El valor introducido no es un número")
}
    else {
        document.write("El valor introducido es un número")
    } 
document.write((numero + no))*/
/*var profes = ["Luis", "Natalia", "Rita", "Eduardo"]
let alumnos = new Array()
var notas = new Array(30)
for(i=0;i<profes.length;i++) {
    document.write(profes[i] + "<br/>")
}
document.write("<br/>")
/* COMANDOS PILA COLA
Meter en la pila = unshift
Sacar de la pila = shift
Meter en la cola = push
Sacar de la cola = pop
*/
/*
profes.unshift("Jordi") // Meto Jordi en la pila (osea posicion 0)
profes.push("Alberto") //Meto a Alberto en la cola (osea posicion profes.length -1)
for(i=0;i<profes.length;i++) {
    document.write(profes[i] + "<br/>")
}
document.write("<br/> Atendido (pop): " + profes.pop() + "<br/>") // Saco a Alberto ya que saco desde la cola
document.write("Atendido (shift): " + profes.shift() + "<br/><br/>") // Saco a Jordi ya que saco desde la pila
for(i=0;i<profes.length;i++) {
    document.write(profes[i] + "<br/>")
}*/
/*function mifuncion(elemento) {
    //debugger
    alert(elemento.innerHTML)
    elemento.innerHTML = "Hola me llamo adrian"
    elemento.className = "azul"
}
/*
function mifuncion() {
      var titular = document.getElementById("titulo")
      alert(titular.innerHTML)
      titular.innerHTML = "Hola me llamo adrian"
}*/

var titular = document.getElementById("titulo")
var parrafo1 = document.getElementById("parrafo")
var hojacss = document.getElementById("hoja")
titular.addEventListener("click",cambiar)
parrafo1.addEventListener("mouseover",cambiar)
debugger
function cambiar() {
    if (titular.innerHTML == "Javascript en DAM1") {
        titular.innerHTML = "Hola Mundo"
        parrafo1.style.backgroundColor = "yellow"
        hojacss.setAttribute("href", "javascript.css")
    }
    else {
        titular.innerHTML = "Javascript en DAM1"
        hojacss.setAttribute("href", "javascript2.css")
    }
}
function dimensiones() {
    titular.innerHTML = "Ancho: " + window.innerWidth + " px - Alto: " + window.innerHeight
    document.title = "Estamos acabando los trucos"
    //window.location.href = "https://www.marca.com/"
}

dimensiones()