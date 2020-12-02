public class Main {




    public static void main(String[] args){

        class overTwentyOne implements CheckPerson{

            public boolean test(Person p) {
                return (p.getAge() > 21);
            }

        }

        SocialNetwork sn = new SocialNetwork();
        CheckPerson criteria = new overTwentyOne();
        SocialNetworkSearcher.printPersons(sn.members, criteria);


    }

}
