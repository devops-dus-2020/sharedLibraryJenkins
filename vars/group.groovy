def groups() {
    def names = ['Laura', 'Sevcan', 'Jana', 'Lisa', 'Moritz', 'Maik', 'Ray', 'Iuliia', 'Indu', 'Karina', 'Adriana', 'Ralf', 'Rainer', 'Andreas', 'Mustafa', 'Sebastian', 'Manuela']
    Collections.shuffle(names)
    for (i = 0; i <names.size(); i++) {
    System.out.println(names[i])
        if ((((i+1) % 3 == 0) && (i <= 9 )) || (i == 12)) {
            System.out.println()
        }
    }
}
