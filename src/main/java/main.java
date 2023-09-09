import com.uptc.fwr.entity.*;
import com.uptc.fwr.parcial.PersisitenceUtil;
import jakarta.persistence.EntityManager;

public class main {
    public static void main(String[] args) {
        System.out.println("123");
        EntityManager entityManager = PersisitenceUtil.getEntityManager();
        Author author = entityManager.find(Author.class,1);

        System.out.println(author);
     /*   Método que reciba por parámetro un identificador de mensaje
     y elimine dicho mensaje.
     */
        int idMessage = 8;
    // deleteMessage(idMessage,entityManager);

       /*   Método que reciba por parámetro un identificador de autor e
        imprima todos los mensajes de dicho autor.
        */
        int idAutor = 2;
        findAuthor(idAutor,entityManager);

        /*   Método que cree 5 nuevos autores. */
        Long cantAuthors=5L;
        createAuthors(cantAuthors,entityManager);

        /*   Método que reciba por parámetro un identificador de mensaje
        y un texto. Debe actualizar el texto del mensaje por el ingresado por
        parámetro. */
        Long id_Message=1L;
        String messageUpdate = "Nuevo Mensaje";
        updateMessage(id_Message,messageUpdate,entityManager);
    }

    private static void updateMessage(Long idMessage, String messageUpdate, EntityManager entityManager) {

        Message message = entityManager.find(Message.class,12);
        entityManager.getTransaction().begin();
        entityManager.refresh(message);
        message.setText(messageUpdate);
        entityManager.getTransaction().commit();
        System.out.println(message);
    }

    private static void createAuthors(Long cantAuthors, EntityManager entityManager) {
        for (Long i = 0L; i < cantAuthors ; i++) {
            Author author = new Author();
            author.setId(1000L+i);
            author.setEmail("correoElectronico@example.com");
            author.setName("Jonh");

            if(entityManager.find(Author.class, author.getId()) == null) {
                entityManager.getTransaction().begin();
                entityManager.persist(author);
                entityManager.getTransaction().commit();
                System.out.println(author);
            } else {
                System.out.println("Author with ID " + author.getId() + " already exists");
            }
        }
    }

    public static void findAuthor(int idAutor,EntityManager entityManager){
        Author author = entityManager.find(Author.class,idAutor);
        System.out.println(author.getMessages());

    }
    public static void deleteMessage(int i,EntityManager entityManager){
        Message message = entityManager.find(Message.class, i);
        if (message != null) {
            System.out.println("Mensaje encontrado: " + message);
            entityManager.getTransaction().begin();
            entityManager.remove(message);
            entityManager.getTransaction().commit();
        } else {
            System.out.println("Mensaje no encontrado con el ID: " + i);
        }
    }
}
