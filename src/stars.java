class  exp {
    static void  age(int age ){
        if(age < 18) throw new ArithmeticException("Age is below an average ");

        else System.out.println("Welcome");
    }

    public static void main(String[] args) {
        exp exp = new exp();
        age(13);

    }
    }
