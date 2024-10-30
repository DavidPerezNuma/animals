// Nombre: Juan David Pérez Numa
// Correo: juperez49@unisalle.edu.co
// Codigo: 4v241102

/**
 * Clase base Animal
 * Representa un animal genérico con atributos comunes y un método para emitir un sonido.
 */
class Animal {
    protected String nombre;
    protected int edad;

    /**
     * Constructor para inicializar el nombre y la edad del animal.
     * @param nombre Nombre del animal.
     * @param edad Edad del animal.
     */
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Método que emite un sonido genérico para cualquier animal.
     */
    public void emitirSonido() {
        System.out.println(nombre + " de " + edad + " años emite un sonido genérico.");
    }
}

/**
 * Clase Mamifero, que hereda de Animal
 * Representa un mamífero con características específicas de este grupo.
 */
class Mamifero extends Animal {
    protected String tipoPiel;

    /**
     * Constructor para inicializar un mamífero con nombre, edad y tipo de piel.
     * @param nombre Nombre del mamífero.
     * @param edad Edad del mamífero.
     * @param tipoPiel Tipo de piel del mamífero.
     */
    public Mamifero(String nombre, int edad, String tipoPiel) {
        super(nombre, edad);
        this.tipoPiel = tipoPiel;
    }

    /**
     * Método que emite un sonido específico de los mamíferos.
     */
    @Override
    public void emitirSonido() {
        System.out.println(nombre + " de " + edad + " años, un mamífero con " + tipoPiel + ", emite un sonido.");
    }
}

/**
 * Clase Ave, que hereda de Animal
 * Representa un ave con características específicas de este grupo.
 */
class Ave extends Animal {
    protected String tipoPlumaje;

    /**
     * Constructor para inicializar un ave con nombre, edad y tipo de plumaje.
     * @param nombre Nombre del ave.
     * @param edad Edad del ave.
     * @param tipoPlumaje Tipo de plumaje del ave.
     */
    public Ave(String nombre, int edad, String tipoPlumaje) {
        super(nombre, edad);
        this.tipoPlumaje = tipoPlumaje;
    }

    /**
     * Método que emite un sonido específico de las aves.
     */
    @Override
    public void emitirSonido() {
        System.out.println(nombre + " de " + edad + " años, un ave con " + tipoPlumaje + ", emite un sonido.");
    }
}

/**
 * Clase Perro, que hereda de Mamifero
 * Representa un perro, una especialización de los mamíferos.
 */
class Perro extends Mamifero {

    public Perro(String nombre, int edad, String tipoPiel) {
        super(nombre, edad, tipoPiel);
    }

    /**
     * Método que emite el sonido característico de un perro.
     */
    @Override
    public void emitirSonido() {
        System.out.println(nombre + " de " + edad + " años, un perro con " + tipoPiel + ", ladra: ¡Guau, guau!");
    }
}

/**
 * Clase Gato, que hereda de Mamifero
 * Representa un gato, una especialización de los mamíferos.
 */
class Gato extends Mamifero {

    public Gato(String nombre, int edad, String tipoPiel) {
        super(nombre, edad, tipoPiel);
    }

    /**
     * Método que emite el sonido característico de un gato.
     */
    @Override
    public void emitirSonido() {
        System.out.println(nombre + " de " + edad + " años, un gato con " + tipoPiel + ", maúlla: ¡Miau, miau!");
    }
}

/**
 * Clase Aguila, que hereda de Ave
 * Representa un águila, una especialización de las aves.
 */
class Aguila extends Ave {

    public Aguila(String nombre, int edad, String tipoPlumaje) {
        super(nombre, edad, tipoPlumaje);
    }

    /**
     * Método que emite el sonido característico de un águila.
     */
    @Override
    public void emitirSonido() {
        System.out.println(nombre + " de " + edad + " años, un águila con " + tipoPlumaje + ", emite un grito agudo.");
    }
}

/**
 * Clase Paloma, que hereda de Ave
 * Representa una paloma, una especialización de las aves.
 */
class Paloma extends Ave {

    public Paloma(String nombre, int edad, String tipoPlumaje) {
        super(nombre, edad, tipoPlumaje);
    }

    /**
     * Método que emite el sonido característico de una paloma.
     */
    @Override
    public void emitirSonido() {
        System.out.println(nombre + " de " + edad + " años, una paloma con " + tipoPlumaje + ", arrulla: ¡Coo, coo!");
    }
}

/**
 * Clase principal App
 * Contiene el método main para ejecutar el ejemplo de herencia con animales.
 */
public class App {
    public static void main(String[] args) throws Exception {

        // Creación de instancias de diferentes animales
        Animal perro = new Perro("Bobby", 5, "Pelo corto");
        Animal gato = new Gato("Mish", 3, "Pelo largo");
        Animal aguila = new Aguila("Aquila", 4, "Plumaje marrón");
        Animal paloma = new Paloma("Pidgey", 2, "Plumaje blanco");

        // Llamada al método emitirSonido de cada animal
        perro.emitirSonido();
        gato.emitirSonido();
        aguila.emitirSonido();
        paloma.emitirSonido();
    }
}
