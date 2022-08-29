package tests;

import models.Contact;
import models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddNewContactTest extends TestBase{

    @BeforeMethod
    public void preCondition(){
        if(!app.getUser().isLogged()){
            app.getUser().login((new User()
                    .withEmail("abc@def.com")
                    .withPassword("$Abcdef12345")));
        }
    }

    @Test (invocationCount = 4)
    public void addNewContactTest(){

        int i = (int)(System.currentTimeMillis()/1000)%3600;
        Contact contact = Contact.builder()
                .name("John")
                .lastname("Snow")
                .phone("12345" + i)
                .email("john" + i + "@mail.com")
                .address("Haifa")
                .description("friend")
                .build();

        app.contact().openContactForm();
        app.contact().fillContactForm(contact);
        app.contact().submitContactForm();

        Assert.assertTrue(app.contact().isContactCreated(contact.getPhone()));
    }

}

