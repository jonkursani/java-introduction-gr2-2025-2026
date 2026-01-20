void main() {
    Scanner sc = new Scanner(System.in);

    // 1)
    System.out.print("Shkruani numrin e studenteve: ");
    int studentsNr = Integer.parseInt(sc.nextLine());
//    int studentsNr = sc.nextInt();

    String[] students = new String[studentsNr];

    // 2)
    fillStudents(students);

    final String STOP = "stop";
    String userInput = "";
    while (!userInput.equalsIgnoreCase(STOP)) {
        System.out.println("==================================");
        System.out.println("1 - Listo te gjithe studentet");
        System.out.println("2 - Gjej dhe shfaq nje student sipas emrit");
        System.out.println("3 - Perditeso emrin e nje studenti ekzistues");
        System.out.println("4 - Fshij nje student ekzistues");
        System.out.println("stop - Ndalo programin dhe shfaq listen finale");
        System.out.println("==================================");

        userInput = sc.nextLine().trim();

        switch (userInput) {
//            case "1":
//                System.out.println("Lista e studenteve");
//                printStudents(students);
//                break;
            case "1" -> {
                System.out.println("Lista e studenteve");
                printStudents(students);
            }
            case "2" -> {
                String name;
                // Validim per mos me leju emra empty
                do {
                    System.out.print("Shkruani emrin e studentit qe po e kerkoni: ");
                    name = sc.nextLine();
                } while (name.isBlank());

                String studentFromArray = getStudent(students, name);
                System.out.println(studentFromArray);
            }
            case "3" -> {
                String oldName;
                do {
                    System.out.print("Shkruani emrin qe deshironi ta perditesoni: ");
                    oldName = sc.nextLine();
                } while (oldName.isBlank());

                String newName;
                do {
                    System.out.print("Shkruani emrin e ri: ");
                    newName = sc.nextLine();
                } while (newName.isBlank());

                updateStudent(students, oldName, newName);
            }
            case "4" -> {
                String name;
                do {
                    System.out.print("Shkruani emrin qe deshironi ta fshini: ");
                    name = sc.nextLine();
                } while (name.isBlank());

                deleteStudent(students, name);
            }
            case STOP -> {
                System.out.println("=== Ju keni ndaluar programin, kjo eshte lista finale me studente ===");
                printStudents(students);
            }
        }
    }
}

public void fillStudents(String[] arr) {
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < arr.length; i++) {
        System.out.printf("Krijoni studentin %d: ", i + 1);
        arr[i] = sc.nextLine();
    }
}

public void printStudents(String[] arr) {
    for (String st : arr) {
        System.out.print(st + " ");
    }
    System.out.println();
}

public int findIndex(String[] arr, String name) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i].equalsIgnoreCase(name)) {
            return i; // nese e gjen ktheje indeksin
        }
    }

    return -1; // nese nuk e gjen e kthen indeksin -1
}

public String getStudent(String[] arr, String name) {
    int index = findIndex(arr, name);

    // nese e kemi gjet
    if (index != -1) {
        return "Studenti: " + arr[index];
    } else {
        return "Studenti me kete emer nuk u gjet";
    }
}

public void updateStudent(String[] arr, String oldName, String newName) {
    int index = findIndex(arr, oldName);

    if (index != -1) {
        arr[index] = newName;
        System.out.println("Studenti u perditesua me sukses");
    } else {
        System.out.println("Studenti me kete emer nuk u gjet");
    }
}

public void deleteStudent(String[] arr, String name) {
    int index = findIndex(arr, name);

    if (index != -1) {
        arr[index] = "";
        System.out.println("Studenti u fshi me sukses");
    } else {
        System.out.println("Studenti me kete emer nuk u gjet");
    }
}