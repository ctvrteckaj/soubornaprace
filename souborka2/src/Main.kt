fun main() {

    println("Násobek  Desítková  Dvojková  Šestnáctková")

    for (i in 0..10) {
        val nasobek = i
        val cislo = nasobek * 5
        val cislo2 = Integer.toBinaryString(cislo)
        val cislo3 = Integer.toHexString(cislo).toUpperCase()

        println("$nasobek        $cislo          $cislo2         $cislo3")
    }
}