public class MainDAO {
    public static void main(String args[]){
        personDAO m = new personDAO("Indra");
        m.setPersonDAO(new MySQLPersonDAO());
        try {
            m.getPersonDAO().savePerson(m);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}