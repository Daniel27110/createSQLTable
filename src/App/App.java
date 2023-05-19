package App;

public class App {

    public static void main(String[] args) {

        // creates one million sql sentences for the creation of information
        int sentences = 0;
        int idCounter = 1;
        int total = 1000;

        while (sentences < total) {
            // each operator creates 3 sql sentences
            if (sentences <= total / 10) {
                operadores(idCounter);
                sentences += 3;
            } else if (sentences <= 2 * total / 10) {
                // each alojamiento creates 2 sql sentences
                alojamientos(idCounter);
                sentences += 2;
            } else if (sentences <= 4 * total / 10) {
                // each hospedaje creates up to 3 sql sentences
                hospedajes(idCounter);
                sentences += 3;
            } else {
                // each cliente creates 2 sql sentences
                clientes(idCounter);
                sentences += 2;
            }
            idCounter++;
        }

    }

    public static void clientes(int id) {
        // creates a sql sentence for the creation of a Cliente
        // example: INSERT INTO A_Cliente (Nombre, DocumentoDeIdentidad, Datos) VALUES
        // ('Juan Perez', 98347298, 1);

        // the name of the cliente can be 'Juan Perez', 'Pedro Perez', 'Pablo Perez',
        // 'Carlos Perez', 'Pepe Perez'
        String nombre = "";
        int nombreRandom = (int) Math.floor(Math.random() * (5 - 1 + 1) + 1);
        if (nombreRandom == 1) {
            nombre = "Juan Perez";
        }

    }

    public static void vecino(int id) {
        // creates a sql sentence for the creation of a Vecino
        // INSERT INTO A_Vecino (Nombre, DocumentoDeIdentidad, Datos) VALUES
        // ('Juanito el vecino', 123123, 7);

        // the name of the vecino can be 'Juanito el vecino', 'Pedrito el vecino',
        // 'Pablito el vecino', 'Carlitos el vecino', 'Pepito el vecino'
        String nombre = "";
        int nombreRandom = (int) Math.floor(Math.random() * (5 - 1 + 1) + 1);
        if (nombreRandom == 1) {
            nombre = "Juanito el vecino";
        } else if (nombreRandom == 2) {
            nombre = "Pedrito el vecino";
        } else if (nombreRandom == 3) {
            nombre = "Pablito el vecino";
        } else if (nombreRandom == 4) {
            nombre = "Carlitos el vecino";
        } else if (nombreRandom == 5) {
            nombre = "Pepito el vecino";
        }

        // the documentoDeIdentidad is between 100000 and 1000000
        int documentoDeIdentidad = (int) Math.floor(Math.random() * (1000000 - 100000 + 1) + 100000);

        // we create a new datos
        datos(id);

        System.out.println("INSERT INTO A_Vecino (Nombre, DocumentoDeIdentidad, Datos) VALUES");
        System.out.println("('" + nombre + "', " + documentoDeIdentidad + ", " + id + ");");

    }

    public static void apartamento(int id) {
        // creates a sql sentence for the creation of a Apartamento
        // example: INSERT INTO A_Apartamento (Id, NumHabitaciones, Menaje, CostoTotal,
        // CostoArrendamiento, CostoInmueble, VecinoDueno) VALUES
        // (5, 5, 'colchon', 500000, 340000, 23000, 123123);

        // we first create a vecino
        vecino(id);

        // the number of habitaciones is between 1 and 10
        int numHabitaciones = (int) Math.floor(Math.random() * (10 - 1 + 1) + 1);

        // the menaje can be 'colchon', 'sabanas', 'almohada', 'televisor', 'nevera',
        // 'lavadora', 'secadora', 'estufa', 'horno', 'microondas', 'licuadora',
        String menaje = "";
        int menajeRandom = (int) Math.floor(Math.random() * (11 - 1 + 1) + 1);
        if (menajeRandom == 1) {
            menaje = "colchon";
        } else if (menajeRandom == 2) {
            menaje = "sabanas";
        } else if (menajeRandom == 3) {
            menaje = "almohada";
        } else if (menajeRandom == 4) {
            menaje = "televisor";
        } else if (menajeRandom == 5) {
            menaje = "nevera";
        } else if (menajeRandom == 6) {
            menaje = "lavadora";
        } else if (menajeRandom == 7) {
            menaje = "secadora";
        } else if (menajeRandom == 8) {
            menaje = "estufa";
        } else if (menajeRandom == 9) {
            menaje = "horno";
        } else if (menajeRandom == 10) {
            menaje = "microondas";
        } else if (menajeRandom == 11) {
            menaje = "licuadora";
        }

        // the costoTotal is between 100000 and 1000000
        int costoTotal = (int) Math.floor(Math.random() * (1000000 - 100000 + 1) + 100000);

        // the costoArrendamiento is between 100000 and 1000000
        int costoArrendamiento = (int) Math.floor(Math.random() * (1000000 - 100000 + 1) + 100000);

        // the costoInmueble is between 10000 and 100000
        int costoInmueble = (int) Math.floor(Math.random() * (100000 - 10000 + 1) + 10000);

        System.out.println(
                "INSERT INTO A_Apartamento (Id, NumHabitaciones, Menaje, CostoTotal, CostoArrendamiento, CostoInmueble, VecinoDueno) VALUES");
        System.out.println("(" + id + ", " + numHabitaciones + ", '" + menaje + "', " + costoTotal + ", "
                + costoArrendamiento + ", " + costoInmueble + ", " + id + ");");

    }

    public static void habitacion(int id) {
        // creates a sql sentence for the creation of a Habitacion
        // example: INSERT INTO A_Habitacion (Id, Costo, TipoDeHabitacion) VALUES
        // (1, 30000, 'Individual');

        // the cost of the habitacion is between 10000 and 50000
        int costo = (int) Math.floor(Math.random() * (50000 - 10000 + 1) + 10000);

        // the type of the habitacion can be 'Estandard', 'SemiDeluxe', 'Deluxe',
        // 'Individual', 'Compartido'
        String tipoDeHabitacion = "";
        int tipoDeHabitacionRandom = (int) Math.floor(Math.random() * (5 - 1 + 1) + 1);
        if (tipoDeHabitacionRandom == 1) {
            tipoDeHabitacion = "Estandard";
        } else if (tipoDeHabitacionRandom == 2) {
            tipoDeHabitacion = "SemiDeluxe";
        } else if (tipoDeHabitacionRandom == 3) {
            tipoDeHabitacion = "Deluxe";
        } else if (tipoDeHabitacionRandom == 4) {
            tipoDeHabitacion = "Individual";
        } else if (tipoDeHabitacionRandom == 5) {
            tipoDeHabitacion = "Compartido";
        }

        System.out.println("INSERT INTO A_Habitacion (Id, Costo, TipoDeHabitacion) VALUES");
        System.out.println("(" + id + ", " + costo + ", '" + tipoDeHabitacion + "');");

    }

    public static void hospedajes(int id) {
        // creates a sql sentence for the creation of a Hospedaje
        // example: INSERT INTO A_HospedajeAbstract (Id, Metraje, Alojamiento,
        // FormaDePago, Capacidad) VALUES
        // (1, 3, 1, 'Diario', 1);

        int metraje = (int) Math.floor(Math.random() * (100 - 1 + 1) + 1);

        // alojamientos are created from 100001 to 200000
        int alojamiento = (int) Math.floor(Math.random() * (200000 - 100001 + 1) + 100001);

        // formaDePago can be Diario, Mensual, Semestral
        String formaDePago = "";
        int formaDePagoRandom = (int) Math.floor(Math.random() * (3 - 1 + 1) + 1);
        if (formaDePagoRandom == 1) {
            formaDePago = "Diario";
        } else if (formaDePagoRandom == 2) {
            formaDePago = "Mensual";
        } else if (formaDePagoRandom == 3) {
            formaDePago = "Semestral";
        }
        int capacidad = (int) Math.floor(Math.random() * (100 - 1 + 1) + 1);

        System.out.println(
                "INSERT INTO A_HospedajeAbstract (Id, Metraje, Alojamiento, FormaDePago, Capacidad) VALUES");
        System.out.println("(" + id + ", " + metraje + ", " + alojamiento + ", '" + formaDePago + "', " + capacidad
                + ");");

        // decides if the hospedaje is a habitacion or a apartamento
        if (Math.random() < 0.5) {
            habitacion(id);
        } else {
            apartamento(id);
        }

    }

    public static void hotel(int id) {
        // creates a sql sentence for the creation of a Hotel
        // example: INSERT INTO A_Hotel (Id, NumEstrellas) VALUES
        // (3, 4);

        int numEstrellas = (int) Math.floor(Math.random() * (5 - 1 + 1) + 1);

        System.out.println("INSERT INTO A_Hotel (Id, NumEstrellas) VALUES");
        System.out.println("(" + id + ", " + numEstrellas + ");");

    }

    public static void hostal(int id) {
        // creates a sql sentence for the creation of a Hostal
        // example: INSERT INTO A_Hostal (Id, HorarioDeApertura, HorarioDeCierre,
        // NumEstrellas) VALUES
        // (1, 900, 1900, 2);

        // opens in the morning between 6 and 10
        int horarioDeApertura = (int) Math.floor(Math.random() * (1000 - 600 + 1) + 600);

        // closes in the afternoon between 18 and 22
        int horarioDeCierre = (int) Math.floor(Math.random() * (2200 - 1800 + 1) + 1800);

        // has between 1 and 3 stars
        int numEstrellas = (int) Math.floor(Math.random() * (3 - 1 + 1) + 1);

        System.out.println("INSERT INTO A_Hostal (Id, HorarioDeApertura, HorarioDeCierre, NumEstrellas) VALUES");
        System.out.println("(" + id + ", " + horarioDeApertura + ", " + horarioDeCierre + ", " + numEstrellas + ");");

    }

    public static void alojamientos(int id) {
        // creates a sql sentence for the creation of an Alojamiento
        // INSERT INTO A_AlojamientoAbstract (Id, Nombre, Direccion, Capacidad, Ciudad,
        // Operador, Fechainiciodisponibilidad, Duraciondisponibilidad, Activo) VALUES
        // (1, 'Hostal 1', 'Direccion1', 10, 'Ciudad1', 1, DATE '2023-05-06', 100, 1);

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
                + operador + ", DATE '" + fechaInicioDisponibilidad + "', " + duracionDisponibilidad + "', " + 1
                + ");");

        // depending on the id, it will create a hotel of hostal
        if (Math.random() < 0.5) {
            hotel(id);
        } else {
            hostal(id);
        }

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

        if (Math.random() < 0.5) {
            personaNatural(id);
        } else {
            empresa(id);
        }

    }

}