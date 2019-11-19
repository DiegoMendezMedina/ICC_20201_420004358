1.-¿Cuál fue el proceso de programación del ajedrez?
Casi todo lo interesante lo hizo iabin. Primero empezamos con la clase Posicion y de ahi fuimos avanzando. Lo que me sorprendio, aunque me confuncia un poco, era como iabin era capaz de ver que cosas ibamos a necesitar conforme programaba.Utilizamos lalibreria de processing para hacer el canvas con la representacion grafica del ajedrez. Aunque tambien hicimos una en la terminal decidi no agregar esta ultima.

2.-¿Cuál es la complejidad del programa completo?(Qué tanto poder de cómputo requiere)?
La verdad es que no requiere un gran poder de computo. Lo mas que utilizamos fue un for doble asi que seria O(2). Supongo para generar lo grafico igual se necesita computo, pero no creo el ajedrez requiera mucho.

3.-¿Cúal es el algoritmo o la función que es más compleja de ejecutar?
Validar los movimientos de cada pieza.

4.-¿Qué conceptos vistos en clase aplicaste y en donde?
Ciclos y condicionales para validar movimientos.
Ciclos para poner los peones.
Herencia en todas las piezas, ya que heredan de Piece y en ChessGUI.
Polimorfismo en las pieza.
Arreglos, todo el tablero y las pieces son arreglo de piezas.

5.-¿Es un proyecto dificil?
No creo que la dificultad de este proyecto radique en conocimientos de programaciòn o que lo que hayamos visto en el curso no nos de las herramientas, si no en poder cubrir todas las reglas del ajedrez. Tener en cuenta jaquez, cuando el rey no pueda hacer un movimiento dado que este lo ponga en jaque, contar los mivimientos para que se decrete tablas, la opcion de ofrecer tablas, etc.

6.-Después de haberlo hecho entre todos ¿Crees que podrías ahora implementarlo completo tú solo?
Me habria dado un poco de flojera haber hecho el ChessGUI, pero creo que con tiempo y si nos resolvieras las dudas que iban saliendo si se sacaba.

7.-Describe con tus palabras cómo implementarías la regla Peón al paso:
Primero validaria que se encuentra en la poosicion inicial , es decir [x][6] para blancas y [x][1] para negras, luego validaria que el lugar dos casillas adelante, arriba si es blanco y abajo si es negro, este disponible y luego validar si se encuentra el peon para hacer la regla.

8.-Describe con tus palabras cómo implementarías detectar que hay un jaque
Cada vez que alguien haga un movimiento calcularia los siguientes validmoves y crearia un metodo que me diera la posicion del rey. Si alguno de los validmoves da con la posicion del rey es jaque.

9.-Describe con tus palabras cómo implementarías enroque
Primero validaria que la torre señalada no haya sido momvida, veria si los validmoves de la torre señalada son interrumpidos por el rey y luego comprobria que el rey no haya sido movido, entonces el enroque es valido.
