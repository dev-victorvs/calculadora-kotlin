import kotlin.math.*

fun main() {
    println(
        "@author: VICTOR VINICIUS VIEIRA SANTOS\n" +
        "@linkedin: https://www.linkedin.com/in/vieira-victor/")
    println("@github: https://github.com/dev-victorvs")

    println("")
    println("------------------------------------------")
    println("-----------CALCULADORA - FÍSICA-----------")
    println("------------------------------------------")

    var controle = 0

    while (controle<1 || controle>3){

        println("\n ESCOLHA ENTRE OS TÓPICOS DISPONÍVEIS:")

        println(
        "1 - MECÂNICA\n" +
        "2 - ONDULATÓRIA\n" +
        "3 - ELETROMAGNETISMO")

        val topico = readLine()!!.toInt()
        controle = topico

        when (topico) {
            1 -> {

                var controleTopico = 0

                while (controleTopico<1 || controleTopico>3) {


                    println("\nSELECIONE A OPERAÇÃO DESEJADA:")
                    println("1 - CINEMÁTICA")
                    println("2 - DINÂMICA")
                    println("3 - HIDROSTÁTICA")

                    val operacao = readLine()!!.toInt()
                    controleTopico = operacao
                    val escolha: String?

                    when (operacao) {
                        1 -> {
                            escolha = "CINEMÁTICA"
                            var controleFuncao = 0
                            while (controleFuncao<1 || controleFuncao>2){
                                println("\nFUNÇÕES DISPONÍVEIS:")
                                println("1 - VELOCIDADE MÉDIA")
                                println("2 - EQUAÇÃO DE TORRICELLI")
                                val funcao = readLine()!!.toInt()
                                controleFuncao = funcao
                                mecanica(topico, escolha, funcao)
                            }
                        }
                        2 -> {
                            escolha = "DINÂMICA"
                            var controleFuncao = 0
                            while (controleFuncao<1 || controleFuncao >2){
                                println("FUNÇÕES DISPONÍVEIS:")
                                println("1 - FORÇA PESO")
                                println("2 - FORÇA CENTRÍPETA")
                                val funcao = readLine()!!.toInt()
                                controleFuncao = funcao
                                mecanica(topico, escolha, funcao)
                            }



                        }
                        3 -> {
                            escolha = "HIDROSTÁTICA"
                            var controleFuncao = 0
                            while (controleFuncao<0 || controleFuncao>2){
                                println("FUNÇÕES DISPONÍVEIS:")
                                println("1 - DENSIDADE")
                                println("2 - EMPUXO")
                                val funcao = readLine()!!.toInt()
                                controleFuncao = funcao
                                mecanica(topico, escolha, funcao)
                            }

                        }
                    }
                }

            }
            2 -> {
                var controleTopico = 0

                while (controleTopico<1 || controleTopico>3){

                    println("\nSELECIONE A OPERAÇÃO DESEJADA:")
                    println("1 - MOVIMENTO HARMÔNICO SIMPLES (PÊNDULOS)")
                    println("2 - ONDAS")
                    println("3 - ACÚSTICA")
                    val operacao = readLine()!!.toInt()
                    controleTopico = operacao
                    val escolha: String?

                    when (operacao) {
                        1 -> {
                            escolha = "MHS"
                            var controleFuncao = 0
                            while (controleFuncao<1 || controleFuncao>2){
                                println("\nFUNÇÕES DISPONÍVEIS:")
                                println("1 - FORÇA")
                                println("2 - PERÍODO")
                                val funcao = readLine()!!.toInt()
                                controleFuncao = funcao
                                mecanica(topico, escolha, funcao)
                            }


                        }
                        2 -> {
                            escolha = "ONDAS"
                            var controleFuncao = 0
                            while (controleFuncao<1 || controleFuncao>2){
                                println("\nFUNÇÕES DISPONÍVEIS:")
                                println("1 - VELOCIDADE DE PROPAGAÇÃO")
                                println("2 - LEI DE SNELL")
                                val funcao = readLine()!!.toInt()
                                controleFuncao = funcao
                                mecanica(topico, escolha, funcao)
                            }

                        }
                        3 -> {
                            escolha = "ACUSTICA"
                            var controleFuncao = 0
                            while(controleFuncao<1 || controleFuncao>2){
                                println("FUNÇÕES DISPONÍVIES:")
                                println("1 - INTENSIDADE SONORA")
                                println("2 - INTERVALO ENTRE DOIS SONS")
                                val funcao = readLine()!!.toInt()
                                controleFuncao = funcao
                                mecanica(topico, escolha, funcao)
                            }

                        }
                    }

                }

        }
            3 -> {
                var controleTopico = 0

                while (controleTopico<1 || controleTopico>3){

                    println("\nSELECIONE A OPERAÇÃO DESEJADA:")
                    println("1 - ELETROESTÁTICA")
                    println("2 - ELETRODINÂMICA")
                    println("3 - INDUÇÃO MAGNÉTICA")
                    val operacao = readLine()!!.toInt()
                    controleTopico = operacao
                    val escolha : String?

                    when(operacao){
                        1 -> {
                            escolha = "ELETROESTATICA"
                            var controleFuncao = 0
                            while(controleFuncao<1 || controleFuncao>2){
                                println("\nFUNÇÕES DISPONÍVEIS:")
                                println("1 - LEI DE COULOMB")
                                println("2 - TRABALHO")
                                val funcao = readLine()!!.toInt()
                                controleFuncao = funcao
                                mecanica(topico, escolha, funcao)
                            }

                        }
                        2 -> {
                            escolha = "ELETRODINÂMICA"
                            var controleFuncao = 0
                            while(controleFuncao<1 || controleFuncao>2){
                                println("\nFUNÇÕES DISPONÍVEIS:")
                                println("1 - INTENSIDADE DA CORRENTE ELÉTRICA")
                                println("2 - RESISTÊNCIA ELÉTRICA")
                                val funcao = readLine()!!.toInt()
                                controleFuncao = funcao
                                mecanica(topico, escolha, funcao)
                            }

                        }
                        3 -> {
                            escolha = "INDUÇÃO"
                            var controleFuncao = 0
                            while (controleFuncao<1 || controleFuncao>2){
                                println("\nFUNÇÕES DISPONÍVEIS:")
                                println("1 - FLUXO DE INDUÇÃO")
                                println("2 - FORÇA ELETROMOTRIZ")
                                val funcao = readLine()!!.toInt()
                                controleFuncao = funcao
                                mecanica(topico, escolha, funcao)
                            }


                        }
                    }
                }

        }
        }
    }
}


fun mecanica (topico: Int, escolha: String, x: Int){
    println("")
    when (topico){
        1-> {
            when (escolha) {
                "CINEMÁTICA" -> {
                    when (x) {
                        1 -> {
                            println("------------------------------------------")
                            println("-------------VELOCIDADE MÉDIA-------------")
                            println("------------------------------------------")

                            println("DIGITE A DISTÂNCIA PERCORRIDA (M)")
                            val distancia = readLine()!!.toFloat()
                            println("DIGITE O INTERVALO DE TEMPO (S)")
                            val tempo = readLine()!!.toFloat()

                            val velocidade = distancia / tempo

                            println("--------------------------------------")
                            println(
                                "DISTÂNCIA: $distancia\n" +
                                        "TEMPO: $tempo\n" +
                                        "VELOCIDADE MÉDIA: $velocidade"
                            )
                            println("--------------------------------------")
                        }
                        2 -> {
                            println("------------------------------------------")
                            println("-----------EQUAÇÃO DE TORRICELLI----------")
                            println("------------------------------------------")

                            println("DIGITE A VELOCIDADE INICIAL")
                            val velocidade0 = readLine()!!.toFloat()
                            println("DIGITE O VALOR DA ACELERAÇÃO")
                            val aceleracao = readLine()!!.toFloat()
                            println("DIGITE O VALOR DA DISTÂNCIA PERCORRIDA")
                            val distancia = readLine()!!.toFloat()

                            val velocidade1: Float = sqrt((velocidade0.pow(2) + (2 * aceleracao * distancia)))
                            println("------------------------------------------")
                            println(
                                "VELOCIDADE INICIAL: $velocidade0\n" +
                                        "ACELERAÇÃO: $aceleracao\n" +
                                        "DISTÂNCIA PERCORRIDA: $distancia\n" +
                                        "VELOCIDADE FINAL: $velocidade1"
                            )
                            println("------------------------------------------")

                        }
                    }
                }
                "DINÂMICA" -> {
                    when (x) {
                        1 -> {
                            println("------------------------------------------")
                            println("----------------FORÇA PESO----------------")
                            println("------------------------------------------")
                            println("DIGITE A MASSA")
                            val massa = readLine()!!.toFloat()
                            val g = 10f
                            val peso = massa * g
                            println("------------------------------------------")
                            println(
                                "MASSA: $massa\n" +
                                        "GRAVIDADE: $g\n" +
                                        "FORÇA PESO: $peso"
                            )
                            println("------------------------------------------")
                        }
                        2 -> {
                            println("------------------------------------------")
                            println("-------------FORÇA CENTRÍPEA--------------")
                            println("------------------------------------------")

                            println("DIGITE A MASSA")
                            val massa = readLine()!!.toFloat()
                            println("DIGITE A VELOCIDADE")
                            val velocidade = readLine()!!.toFloat()
                            println("DIGITE O RAIO")
                            val raio = readLine()!!.toFloat()

                            val forca = (massa * ((velocidade.pow(2)) / raio))

                            println("------------------------------------------")
                            println(
                                "MASSA: $massa\n" +
                                        "VELOCIDADE: $velocidade\n" +
                                        "FORÇA CENTRÍPETA: $forca"
                            )
                            println("------------------------------------------")


                        }
                    }
                }
                "HIDROSTÁTICA" -> {
                    when (x) {
                        1 -> {
                            println("------------------------------------------")
                            println("----------------DENSIDADE-----------------")
                            println("------------------------------------------")
                            println("DIGITE A MASSA")
                            val massa = readLine()!!.toFloat()
                            println("DIGITE O VOLUME")
                            val volume = readLine()!!.toFloat()

                            val densidade = massa / volume

                            println("------------------------------------------")
                            println(
                                "MASSA: $massa\n" +
                                        "VOLUME: $volume\n" +
                                        "DENSIDADE: $densidade"
                            )
                            println("------------------------------------------")

                        }
                        2 -> {
                            println("------------------------------------------")
                            println("------------------EMPUXO------------------")
                            println("------------------------------------------")
                            println("DIGITE A DENSIDADE DO FLUIDO")
                            val densidade = readLine()!!.toFloat()
                            println("DIGITE O VOLUME IMERSO DO CORPO")
                            val volume = readLine()!!.toFloat()

                            val g = 10f

                            val emp = densidade * g * volume

                            println("------------------------------------------")
                            println(
                                "DENSIDADE: $densidade\n" +
                                        "VOLUME IMERSO: $volume\n" +
                                        "GRAVIDADE: $g\n" +
                                        "EMPUXO: $emp N"
                            )
                            println("------------------------------------------")

                        }
                    }
                }

            }
        }
        2->{
            when(escolha){
                "MHS" -> {
                    when (x){
                        1 -> {
                            println("------------------------------------------")
                            println("-------------------FORÇA------------------")
                            println("------------------------------------------")

                            println("DIGITE A MASSA:")
                            val massa = readLine()!!.toFloat()
                            println("DIGITE O COMPRIMENTO DO FIO:")
                            val comprimento = readLine()!!.toFloat()
                            println("DIGITE A ELONGAÇÃO:")
                            val elg = readLine()!!.toFloat()

                            val g = 10f

                            val forca = -((massa*g)/comprimento)*elg

                            println("------------------------------------------")
                            println("MASSA: $massa\n" +
                                    "GRAVIDADE: $g\n" +
                                    "COMPRIMENTO: $comprimento\n" +
                                    "ELONGAÇÃO: $elg\n" +
                                    "FORÇA: $forca")
                            println("------------------------------------------")
                        }
                        2 -> {
                            println("------------------------------------------")
                            println("-----------------PERÍODO------------------")
                            println("------------------------------------------")

                            println("DIGITE O COMPRIMENTO DO FIO:")
                            val comprimento = readLine()!!.toFloat()

                            val g = 10f
                            val pi = 3.14f

                            val periodo = (2*pi) * sqrt((comprimento/g))

                            println("------------------------------------------")
                            println("COMPRIMENTO: $comprimento\n" +
                                    "GRAVIDADE: $g\n" +
                                    "PI: $pi\n" +
                                    "PERÍODO: $periodo")
                        }
                    }
                }
                "ONDAS" ->{
                    when (x) {
                        1-> {
                            println("------------------------------------------")
                            println("---------VELOCIDADE DE PROPAGAÇÃO---------")
                            println("------------------------------------------")

                            println("DIGITE O COMPRIMENTO DA ONDA")
                            val comprimento = readLine()!!.toFloat()
                            println("DIGITE A FREQUÊNCIA")
                            val freq = readLine()!!.toFloat()

                            val v = comprimento * freq

                            println("------------------------------------------")
                            println("COMPRIMENTO DA ONDA: $comprimento\n" +
                                    "FREQUÊNCIA: $freq\n" +
                                    "VELOCIDADE DE PROPAGAÇÃO: $v")
                            println("------------------------------------------")
                        }
                        2 -> {
                            println("------------------------------------------")
                            println("---------------LEI DE SNELL---------------")
                            println("------------------------------------------")

                            println("DIGITE O ÍNDICE DE REFRAÇÃO A")
                            val indA = readLine()!!.toFloat()

                            println("DIGITE O ÂNGULO FORMADO POR A")
                            val angA = readLine()!!.toFloat()

                            println("DIGITE O ÂNGULO FORMADO POR B")
                            val angB = readLine()!!.toFloat()

                            val indB = (indA * (sin(angA))) / (sin(angB))

                            println("------------------------------------------")
                            println("ÍNDICE DE REFRAÇÃO DE A: $indA\n" +
                                    "ÂNGULO FORMADO POR A: $angA\n" +
                                    "ÂNGULO FORMADO POR B: $angB\n" +
                                    "ÍNDICE DE REFRAÇÃO DE B: $indB")
                        }
                    }
                }
                "ACUSTICA" ->{
                    when(x){
                        1 -> {
                            println("------------------------------------------")
                            println("------------INTENSIDADE SONORA------------")
                            println("------------------------------------------")

                            println("DIGITE A ENERGIA UTILIZADA")
                            val energia = readLine()!!.toFloat()
                            println("DIGITE A ÁREA")
                            val area = readLine()!!.toFloat()
                            println("DIGITE O INTERVALO DE TEMPO")
                            val intervalo = readLine()!!.toFloat()

                            val intensidade = (energia/(area*intervalo))
                            println("------------------------------------------")
                            println("ENERGIA: $energia\n" +
                                    "ÁREA: $area\n" +
                                    "INTERVALO DE TEMPO: $intervalo\n" +
                                    "INTENSIDADE SONORA: $intensidade")
                            println("------------------------------------------")

                        }
                        2 -> {
                            println("------------------------------------------")
                            println("--------INTERVALO ENTRE DOIS SONS---------")
                            println("------------------------------------------")

                            println("DIGITE A FREQUÊNCIA DO PRIMEIRO SOM")
                            val freq1 = readLine()!!.toFloat()
                            println("DIGITE A FREQUÊNCIA DO SEGUNDO SOM")
                            val freq2 = readLine()!!.toFloat()

                            val intervalo = freq1/freq2

                            println("------------------------------------------")
                            println("FREQUÊNCIA 1: $freq1\n" +
                                    "FREQUÊNCIA 2: $freq2\n" +
                                    "INTERVALO ENTRE OS SONS: $intervalo")
                            println("------------------------------------------")
                        }
                    }

                }
            }
        }
        3->
            when(escolha){
                "ELETROESTATICA" -> {
                    when(x){
                        1 -> {
                            println("------------------------------------------")
                            println("--------------LEI DE COULOMB--------------")
                            println("------------------------------------------")

                            println("DIGITE O VALOR DA PRIMEIRA CARGA")
                            val q1 = readLine()!!.toFloat()

                            println("DIGITE O VALOR DA SEGUNDA CARGA")
                            val q2 = readLine()!!.toFloat()

                            println("DIGITE A DISTÂNCIA ENTRE AS CARGAS")
                            val dist = readLine()!!.toFloat()

                            val k = 9E9f

                            val f = (k*(q1*q2/(dist.pow(2))))

                            println("------------------------------------------")
                            println("CARGA 1: $q1\n" +
                                    "CARGA 2: $q2\n" +
                                    "CONSTANTE ELÉTRICA NO VÁCUO: $k\n" +
                                    "FORÇA: $f")
                            println("------------------------------------------")
                        }
                        2 -> {

                            println("------------------------------------------")
                            println("-----------------TRABALHO-----------------")
                            println("------------------------------------------")

                            println("DIGITE O VALOR DA CARGA")
                            val q = readLine()!!.toFloat()
                            println("DIGITE O POTENCIAL ELÉTRICO EM A")
                            val potA = readLine()!!.toFloat()
                            println("DIGITE O POTENCIAL ELÉTRICO EM B")
                            val potB = readLine()!!.toFloat()

                            val t = (q*(potA*potB))

                            println("------------------------------------------")
                            println("CARGA: $q\n" +
                                    "POTENCIAL ELÉTRICO A: $potA\n" +
                                    "POTENCIAL ELÉTRICO B: $potB\n" +
                                    "TRABALHO: $t")
                            println("------------------------------------------")

                        }
                    }
                }
                "ELETRODINÂMICA" -> {
                    when(x){
                        1 -> {
                            println("------------------------------------------")
                            println("-----INTENSIDADE DA CORRENTE ELÉTRICA-----")
                            println("------------------------------------------")

                            println("DIGITE O MÓDULO DA CARGA ELÉTRICA")
                            val q = readLine()!!.toFloat()
                            println("DIGITE O INTERVALO DE TEMPO")
                            val t = readLine()!!.toFloat()

                            val i = q/t

                            println("------------------------------------------")
                            println("CARGA: $q\n")
                            println("INTERVALO DE TEPO: $t\n" +
                                    "INTENSIDADE DA CORRENTE ELÉTRICA: $i")
                            println("------------------------------------------")

                        }
                        2 -> {
                            println("------------------------------------------")
                            println("-----------RESISTÊNCIA ELÉTRICA-----------")
                            println("------------------------------------------")

                            println("DIGITE A TENSÂO")
                            val u = readLine()!!.toFloat()
                            println("DIGITE A INTENSIDADE")
                            val i = readLine()!!.toFloat()

                            val r = u/i
                            println("------------------------------------------")
                            println("TENSÃO: $u\n" +
                                    "INTENSIDADE: $i\n" +
                                    "RESISTENCIA ELÉTRICA: $r")
                            println("------------------------------------------")
                        }
                    }
                }
                "INDUÇÃO" -> {
                    when(x){
                        1 -> {
                            println("------------------------------------------")
                            println("-------------FLUXO DE INDUÇÃO-------------")
                            println("------------------------------------------")

                            println("DIGITE A INTENSIDADE DO CAMPO MAGNÉTICO")
                            val intensidade = readLine()!!.toFloat()
                            println("DIGITE A ÁREA DA SUPERFÍCIE")
                            val area = readLine()!!.toFloat()
                            println("DIGITE O ÂNGULO ENTRE A SUPERFÍCIE E A RETA NORMAL")
                            val angulo = readLine()!!.toFloat()

                            val fluxo = (intensidade*area*(cos(angulo)))
                            println("------------------------------------------")
                            println("INTENSIDADE: $intensidade\n" +
                                    "ÁREA: $area\n" +
                                    "ÂNGULO: $angulo\n" +
                                    "FLUXO DE INDUÇÃO MAGNÉTICA: $fluxo")
                            println("------------------------------------------")
                        }
                        2 ->{
                            println("------------------------------------------")
                            println("------------FORÇA ELETROMOTRIZ------------")
                            println("------------------------------------------")

                            println("DIGITE A VARIAÇÃO DE FLUXO")
                            val vfluxo = readLine()!!.toFloat()
                            println("DIGITE A VARIAÇÃO DE TEMPO")
                            val vtempo = readLine()!!.toFloat()

                            val f = vfluxo/vtempo
                            println("------------------------------------------")
                            println("VARIAÇÃO DE FLUXO: $vfluxo\n" +
                                    "VARIAÇÃO DE TEMPO: $vtempo\n" +
                                    "FORÇA ELETROMOTRIZ: $f")
                            println("------------------------------------------")
                        }
                    }
                }
            }
        }

}
