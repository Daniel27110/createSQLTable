package App;

public class App {

    public static void main(String[] args) {

        // creates one million sql sentences for the creation of information
        for (int i = 1; i <= 1000000; i++) {
            if (i <= 100000 / 3) {
                operadores(i);
            }
            if (i > 100000 / 3 && i <= 100000 / 3 * 2) {
                alojamientos(i);
            }
        }

    }

    public static void alojamientos(int id) {
        // creates a sql sentence for the creation of an Alojamiento
        // INSERT INTO A_AlojamientoAbstract (Id, Nombre, Direccion, Capacidad, Ciudad,
        // Operador, Fechainiciodisponibilidad, Duraciondisponibilidad) VALUES
        // (1, 'Hostal 1', 'Direccion1', 10, 'Ciudad1', 1, DATE '2023-05-06', 100);

        String nombre = "alojamiento" + id;
        String direccion = "direccion" + id;
        int capacidad = (int) Math.floor(Math.random() * (100 - 1 + 1) + 1);
        String ciudad = "ciudad" + id;
        int operador = (int) Math.floor(Math.random() * (100000 / 3 - 1 + 1) + 1);
        String fechaInicioDisponibilidadAño = "20" + (int) Math.floor(Math.random() * (25 - 0 + 1) + 0);
        String fechaInicioDisponibilidadMes = "0" + (int) Math.floor(Math.random() * (9 - 1 + 1) + 1);
        String fechaInicioDisponibilidadDia = "0" + (int) Math.floor(Math.random() * (9 - 1 + 1) + 1);
        String fechaInicioDisponibilidad = fechaInicioDisponibilidadAño + "-" + fechaInicioDisponibilidadMes + "-"
                + fechaInicioDisponibilidadDia;
        int duracionDisponibilidad = (int) Math.floor(Math.random() * (1000 - 1 + 1) + 1);

        System.out.println(
                "INSERT INTO A_AlojamientoAbstract (Id, Nombre, Direccion, Capacidad, Ciudad, Operador, Fechainiciodisponibilidad, Duraciondisponibilidad) VALUES");
        System.out.println("(" + id + ", '" + nombre + "', '" + direccion + "', " + capacidad + ", '" + ciudad + "', "
                + operador + ", DATE '" + fechaInicioDisponibilidad + "', " + duracionDisponibilidad + ");");

        // depending on the id, it will create a hotel of hostal

    }

    public static void datos(int id) {
        // creates a sql sentence for the creation of data
        // example: INSERT INTO INSERT INTO A_Datos (Id, Correo, Telefono) VALUES
        // (1, 'juanperez@gmail.com', 3177651245);

        String correo = "correo" + id + "@gmail.com";
        String telefono = "3" + (int) Math.floor(Math.random() * (9999999 - 1000000 + 1) + 1000000);
        System.out.println("INSERT INTO A_Datos (Id, Correo, Telefono) VALUES");
        System.out.println("(" + id + ", '" + correo + "', " + telefono + ");");
    }

    public static void personaNatural(int id) {
        // creates a sql sentence for the creation of a PersonaNatural
        // example: INSERT INTO A_PersonaNatural (Id, DocumentoDeIdentidad) VALUES
        // (1, 2198371);

        int documentoDeIdentidad = (int) Math.floor(Math.random() * (99999999 - 10000000 + 1) + 10000000);

        System.out.println("INSERT INTO A_PersonaNatural (Id, DocumentoDeIdentidad) VALUES");
        System.out.println("(" + id + ", " + documentoDeIdentidad + ");");

    }

    public static void empresa(int id) {
        // creates a sql sentence for the creation of a Empresa
        // INSERT INTO A_Empresa (Id, RegistroEnCamara) VALUES
        // (4, 1);

        // either a 1 or a 0
        int registroEnCamara = (int) Math.floor(Math.random() * (1 - 0 + 1) + 0);

        System.out.println("INSERT INTO A_Empresa (Id, RegistroEnCamara) VALUES");
        System.out.println("(" + id + ", " + registroEnCamara + ");");

    }

    public static void operadores(int id) {
        // creates a sql sentence for the creation of operators
        // example: INSERT INTO A_OperadorDeAlojamientoAbstract (Id, Nombre, Datos)
        // VALUES (1,
        // 'Carlos Torres', 3);

        String nombre = "operador" + id;
        datos(id);
        int datos = id;
        System.out.println("INSERT INTO A_OperadorDeAlojamientoAbstract (Id, Nombre, Datos) VALUES");
        System.out.println("(" + id + ", '" + nombre + "', " + datos + ");");

        // depending on the id, it will create a sentence
        // for the creation of a PersonaNatural or a Empresa

        if (id % 2 == 0) {
            personaNatural(id);
        } else {
            empresa(id);
        }

    }

}