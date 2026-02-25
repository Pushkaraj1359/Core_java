    class excuteFlow {

        static {
            System.out.println("Static block");
        }

        {
            System.out.println("Instance block");
        }

        excuteFlow() {
            System.out.println("Constructor");
        }

        public static void main(String[] args) {
            System.out.println("Main method");
            excuteFlow obj1 = new excuteFlow();
            excuteFlow obj2 = new excuteFlow();
        }
    }

// output
    // Static block (onces)
    // Main method
    // Instance block
    // Constructor
    // Instance block
    // Constructor

