package ru.job4j.oop;

public class Profession {

    private String name;
    private String surname;
    private String education;
    private String birthday;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public String getBirthday() {
        return birthday;
    }

    public class Doctor extends Profession {

        private String pacient;

        private String diagnosis;

        public String heal(String pacient) {
            return diagnosis;
        }

        public class Dentist extends Doctor {

            private String operation;

            private String tooth;

            public String heal(String pacient) {
                return operation;
            }

            public String getOperation(String operation) {
                return tooth;
            }
        }

        public class Surgeon extends Doctor {

            private String operation;

            private String organ;

            public String heal(String pacient) {
                return operation;
            }

            public String getOperation(String operation) {
                return organ;
            }
        }

    }

    public class Engineer extends Profession {

        private String task;

        private String equipment;

        public String work(String task) {
            return equipment;
        }

        public class Programmer extends Profession {
            private String program;

            private String time;

            public String working(String program) {
                return time;
            }
        }

        public class Builder extends Profession {
            private String build;

            private String time;

            public String working(String build) {
                return time;
            }
        }
    }
}
