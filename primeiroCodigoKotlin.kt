fun main(){
    println("""Escolha o que você quer fazer. Digite:
    1 - para somar
    2 - para subtarir""")
    var opcao = readln().toInt()

    when(opcao) {
        1 -> somaDoisNumeros()
        2 -> subtraiDoisNumeros()
        else -> println("Opção inválida!")
    }
}

fun somaDoisNumeros(){
    println("**Essa opção soma de dois números inteiros **\n")
    print("Digite um número: ")
    val n1 = readln().toInt()

    print("Digite outro número: ")
    val n2 = readln().toInt()

    println("\nA soma de $n1 e $n2 é ${n1 + n2}.")
}

fun subtraiDoisNumeros(){
    println("**Essa opção faz a subtração de dois números inteiros **\n")
    print("Digite um número: ")
    val n1 = readln().toInt()

    print("Digite outro número: ")
    val n2 = readln().toInt()

    println("\nA subtração de $n1 e $n2 é ${n1 - n2}.")
}