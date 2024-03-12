// Questão 1
class Produto(val nome: String, var preco: Double) // Adicionado o construtor primário

// Questão 2
class Cliente {
    var nome: String = ""
    private var idade: Int = 30 // Definindo a idade padrão como 30

    // Método para mostrar a idade do cliente
    fun mostrarIdade() {
        println("Idade do cliente: $idade")
    }
}

// Questão 3
abstract class Personagem {
    abstract fun atacar()
}

class Guerreiro : Personagem() {
    override fun atacar() {
        println("Guerreiro atacando com espada!")
    }
}

class Mago : Personagem() {
    override fun atacar() {
        println("Mago lançando feitiço!")
    }
}

// Questão 4
interface FormaGeometrica {
    fun calcularArea(): Double
}

class Retangulo(val altura: Double, val largura: Double) : FormaGeometrica {
    override fun calcularArea(): Double {
        return altura * largura
    }
}

class Circulo(val raio: Double) : FormaGeometrica {
    override fun calcularArea(): Double {
        return Math.PI * raio * raio
    }
}

// Questão 5
class ContaBancaria {
    var numeroConta: String = ""
    var nomeTitular: String = ""
    var saldo: Double = 0.0 // Removido o modificador de visibilidade private
        set(value) {
            if (value < 0) {
                println("O saldo não pode ser negativo. Definindo saldo para 0.")
                field = 0.0
            } else {
                field = value
            }
        }
}

fun main() {
    // Questão 1
    val produto1 = Produto("Celular", 1500.0)
    val produto2 = Produto("Notebook", 2500.0)
    val produto3 = Produto("Tablet",preco = 2000.0)

    println("Nome: ${produto1.nome}, Preço: ${produto1.preco}")
    println("Nome: ${produto2.nome}, Preço: ${produto2.preco}")
    println("Nome: ${produto3.nome}, Preço: ${produto3.preco}")

    // Questão 2
    val cliente = Cliente()
    cliente.mostrarIdade()

    // Questão 3
    val guerreiro = Guerreiro()
    guerreiro.atacar()

    val mago = Mago()
    mago.atacar()

    // Questão 4
    val retangulo = Retangulo(3.0, 5.0)
    println("Área do retângulo: ${retangulo.calcularArea()}")

    val circulo = Circulo(2.0)
    println("Área do círculo: ${circulo.calcularArea()}")

    // Questão 5
    val conta = ContaBancaria()
    conta.nomeTitular = "João da Silva"
    conta.saldo = -100.0 // Agora a validação do saldo funciona corretamente
    println("Nome do titular: ${conta.nomeTitular}")
    println("Saldo: ${conta.saldo}")
}
