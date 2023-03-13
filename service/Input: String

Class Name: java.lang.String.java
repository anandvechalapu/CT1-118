Input

Table Name: Person

Columns: 

person_id (int)

first_name (String)

last_name (String)

import org.springframework.stereotype.Service;

@Service
public class PersonService {
    
    public Person getPersonById(int personId) {
        // Implementation
    }
    
    public List<Person> getPeopleByName(String firstName, String lastName) {
        // Implementation
    }
    
    public List<Person> getAllPeople() {
        // Implementation
    }
    
    public void savePerson(Person person) {
        // Implementation
    }
    
    public void updatePerson(Person person) {
        // Implementation
    }
    
    public void deletePerson(int personId) {
        // Implementation
    }
}