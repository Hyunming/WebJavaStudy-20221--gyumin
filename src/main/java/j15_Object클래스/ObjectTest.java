package j15_Object클래스;
/*모든 클래스는 Object클래스를 상속받는다*/
public class ObjectTest extends Object{


        private String name;
        public String address;
        public ObjectTest() {}

        @Override
        public String toString() {
            return " name: " + name+ " address: " + address;
        }

        public ObjectTest(String name, String address) {
            this.name = name;
            this.address = address;
        }
        public String showInfo() {
            return " name: " + name+ " address: " + address;
        }


    }

