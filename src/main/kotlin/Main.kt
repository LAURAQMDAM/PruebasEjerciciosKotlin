fun main(){
    println("Hello tu, ingresame dos numero y se hara la multiplicacion entre ellos")

    print("Ingrese un numero")
    val valor1 = readln().toInt()
    println(valor1)
    print("ingrese un segundo numero")
    val valor2 = readln().toInt()
    println(valor2)

    var multiplica=valor1*valor2
    println("el resultado de la multiplicacion de los numeros ingresados es $multiplica")
}