public class Main {




    public static void main(String[] args){

        CheckPerson nameStartsWithA = (Person p) -> (p.name.startsWith("A"));

        SocialNetwork sn = new SocialNetwork();

        SocialNetworkSearcher.printPersons(sn.members, nameStartsWithA);


    }

}
