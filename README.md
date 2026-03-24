# Navigation Between Screens App

## Descrição
Este projeto foi desenvolvido com o objetivo de praticar a navegação entre telas em um aplicativo Android utilizando Jetpack Compose.

## Objetivo
O principal objetivo foi entender como funciona a navegação entre telas e como passar informações de uma tela para outra, utilizando diferentes tipos de parâmetros.

## O que foi implementado

Foi implementada a navegação entre telas utilizando NavHost e NavController.

Na tela de perfil, foram utilizados parâmetros obrigatórios (nome e idade), que precisam ser enviados na rota para que a navegação funcione corretamente.

Na tela de pedidos, foi utilizado um parâmetro opcional (cliente). Caso esse valor não seja enviado, o sistema utiliza um valor padrão para evitar erros.

Também foi implementado o envio de múltiplos parâmetros entre telas, permitindo passar mais de uma informação ao mesmo tempo.

Além disso, foi feito o tratamento de valores nulos utilizando o operador Elvis (?:), garantindo que a aplicação não quebre caso algum dado não seja recebido.

Para evitar problemas com espaços e caracteres especiais, foi utilizado encoding nos parâmetros enviados pela navegação.

## Como a navegação funciona

A navegação foi configurada utilizando o NavHost, que define as rotas da aplicação.

Cada tela é representada por um composable, onde também são definidos os parâmetros esperados.

O NavController é responsável por controlar a navegação entre as telas, utilizando o método navigate().

Os parâmetros são enviados na rota e recuperados através do backStackEntry.arguments.

## Conclusão

Com esse projeto foi possível entender na prática como funciona a navegação entre telas no Android e como enviar e receber dados de forma segura e organizada.
