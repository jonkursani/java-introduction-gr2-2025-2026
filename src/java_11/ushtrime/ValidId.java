void main() {
//    Shkruaj aplikacionin i cili e kerkon nje ID 7-shifrore te perdoruesit.
//    Ne rast kur nuk e ploteson kete kriter,
//    kerko nga perdoruesi qe te shkruaj perseri

    Scanner sc = new Scanner(System.in);

    String id;
    do {
        System.out.print("Shkruani id 7-shifrore (KSxxxxx): ");
        id = sc.nextLine();
    } while (id.trim().length() != 7 || !id.startsWith("KS"));

    System.out.println("Id juaj: " + id);
}