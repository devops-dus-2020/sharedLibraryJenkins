def groups() {
    def names = ['Laura', 'Sevcan', 'Jana', 'Lisa', 'Moritz', 'Maik', 'Ray', 'Iuliia', 'Indu', 'Karina', 'Adriana', 'Ralf', 'Rainer', 'Andreas', 'Mustafa', 'Sebastian', 'Manuela']
    Collections.shuffle(names)
    for (i = 0; i <18; i++) {
    System.out.println(names[i])
        if ((i+1) % 4 == 0) {
            System.out.println()
        }
    }
}
