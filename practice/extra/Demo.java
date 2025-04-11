package practice.extra;
//
        class Demo {
    public static void main(String[] args) {
        System.out.println("Main Method: x = " + x + ", y = " + y);
    }
            static int x = 10;
            static { //block  (this is used for configuraton orsecurity checks beforehand)(just like finally keyword in)
                System.out.println("Static Block 1: x = " + x);
                x = 20; // Modifying static variable
            }
            static int y = initializeY();
            //block
            static {
                System.out.println("Static Block 2: y = " + y);
            }
            static int initializeY() {
                System.out.println("Static Method: Initializing y");
                return 30;
            }

        }

