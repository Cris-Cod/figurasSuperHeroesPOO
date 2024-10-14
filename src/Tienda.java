public class Tienda {

    public static void main(String[] args) {

        SuperHeroe superHeroe1 = new SuperHeroe("Antorcha Humana");
        superHeroe1.setDescripcion("Creciendo en Glenville, Nueva York, una ciudad ficticia suburbana de Long Island, Jonathan Storm perdió a su madre debido a un accidente automovilístico del cual su padre, el cirujano Franklin Storm");
        superHeroe1.setCapa(false);

        Dimension dimension1 = new Dimension(10, 2.5,2);

        Figura figura1 = new Figura("1", 120, superHeroe1, dimension1);

        SuperHeroe heroe2 = new SuperHeroe("Bruja Escarlata");
        heroe2.setDescripcion("Después de la trágica muerte de su hija, Anya, en un incendio provocado por una multitud anti-mutante, el mutante Magneto, utilizó sus poderes y exterminó a toda la multitud ante la mirada horrorizada de su esposa, Magda");
        heroe2.setCapa(true);

        Dimension dimension2 = new Dimension(8, 3.5,3);

        Figura figura2 = new Figura("2", 150, heroe2, dimension2);

        SuperHeroe heroe3 = new SuperHeroe("Cable");
        heroe3.setDescripcion("El nacimiento de Nathan Summers fue cuidadosamente orquestado por el genetista Mr. Siniestro. Siniestro sabía que el ADN de la familia Summers era uno de los más puros entre los mutantes");
        heroe3.setCapa(false);

        Dimension dimension3 = new Dimension(12, 3.5,3);

        Figura figura3 = new Figura("3", 130, heroe3, dimension3);

        SuperHeroe heroe4 = new SuperHeroe("Doctor Vudú");
        heroe4.setDescripcion("Después de estudiar psicología en Estados Unidos durante doce años, Jericho Drumm regresó a Haití, su tierra natal, para ayudar a Daniel, su hermano, a luchar contra un hechicero maligno. Cuando Daniel yacía en el lecho de muerte");
        heroe4.setCapa(true);

        Dimension dimension4 = new Dimension(10, 2.5,2);

        Figura figura4 = new Figura("4", 100, heroe4, dimension4);

        SuperHeroe heroe5 = new SuperHeroe("Visión");
        heroe5.setDescripcion("El cuerpo de Visión fue, originalmente, el cuerpo de la Antorcha Humana Original (creada por el científico Phineas Horton y componente del antiguo superequipo de los Invasores durante la Segunda Guerra Mundial)");
        heroe5.setCapa(true);

        Dimension dimension5 = new Dimension(13, 2.5,3);

        Figura figura5 = new Figura("5", 100, heroe5, dimension5);


        Coleccion coleccion = new Coleccion("Primera");
        coleccion.addFigura(figura1);
        coleccion.addFigura(figura2);
        coleccion.addFigura(figura3);
        coleccion.addFigura(figura4);
        coleccion.addFigura(figura5);

        coleccion.toString();
        coleccion.mostrarFiguras();
        coleccion.superHeroeConCapa();
        System.out.println("Coleccion mas valiosa: " + coleccion.masValioso());
        System.out.println("Costo total coleccion: " + coleccion.getValorColeccion());
        System.out.println("Tamaño total de la coleccion: " + coleccion.getVolumenColeccion());

    }
}
