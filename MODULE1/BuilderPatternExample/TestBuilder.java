package MODULE1.BuilderPatternExample;

class TestBuilder {

    public static void main(String[] args) {

        Computer gamingComputer = new Computer.Builder("Intel i7", "16GB")
                .setStorage("1TB SSD")
                .build();

        System.out.println(gamingComputer);

        Computer officeComputer = new Computer.Builder("Intel i5", "8GB")
                .build();

        System.out.println(officeComputer);
    }
}
