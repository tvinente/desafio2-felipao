val numeroVitorias = readln()!!.toInt()
val numeroDerrotas = readln()!!.toInt()
var saldoVitorias = 0
var nivel = ""

fun main() {

    saldoVitorias = numeroVitorias - numeroDerrotas

    when {
        saldoVitorias < 10 -> nivel = "Ferro"
        saldoVitorias >= 11 && saldoVitorias == 20 -> nivel = "Bronze"
        saldoVitorias >= 21 && saldoVitorias == 50 -> nivel = "Prata"
        saldoVitorias >= 51 && saldoVitorias == 80 -> nivel = "Ouro"
        saldoVitorias >= 81 && saldoVitorias == 90 -> nivel = "Diamante"
        saldoVitorias >= 91 && saldoVitorias == 100 -> nivel = "Lendário"
        saldoVitorias >= 101 -> nivel = "Imortal"
    }
    println("O Herói tem de saldo de $saldoVitorias, está no nível de $nivel")
}