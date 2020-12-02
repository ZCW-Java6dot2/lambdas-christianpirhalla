public class Main {




    public static void main(String[] args){

        CheckPerson isFemale = new CheckPerson() {

            public boolean test(Person p) {
                return (p.gender.equals(Person.Sex.FEMALE));
            }

        };

        SocialNetwork sn = new SocialNetwork();

        SocialNetworkSearcher.printPersons(sn.members, isFemale);


    }

}
