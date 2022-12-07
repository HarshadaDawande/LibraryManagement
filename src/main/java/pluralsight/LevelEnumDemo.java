package main.java.pluralsight;

public enum LevelEnumDemo {

        HIGH  (3),  //calls constructor with value 3
        MEDIUM(2),  //calls constructor with value 2
        LOW   (1)   //calls constructor with value 1
        ; // semicolon needed when fields / methods follow


        private final int levelCode;

        LevelEnumDemo(int levelCode) {
            this.levelCode = levelCode;
        }

        public int getLevelCode() {
            return this.levelCode;
        }

    }
