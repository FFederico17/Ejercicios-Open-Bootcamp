public class CocheCRUDImpl implements CocheCRUD {


    @Override
    public void save() {

    }

    @Override
    public void findAll() {

    }

    @Override
    public void delete() {

    }

    String save = "Guardando coche";
    String findAll = "Buscando todos los coches";
    String delete = "Borrando coche";

    @Override
    public String toString() {
        return "CocheCRUDImpl:" +
                " save = " + save +
                ", findAll = " + findAll +
                ", delete = " + delete;
    }
}
