class Student4{
    int id;
    String name;
    int[] marks;

	Student4(int id,String name){
		this.id=id;
		this.name=name;
	}

    void setmarks(int[] marks) {
        this.marks = marks;
    }

    int calctotal() {
        int total = 0;

        for (int i = 0; i < this.marks.length; i++) {
            total = total + this.marks[i];
        }

        return total;
    }

    double calcavg() {
        return (double) calctotal() / this.marks.length;
    }

    char getResult(double average) {
        char result;

        if (average >= 75) {
            result = 'A';
        } else if (average >= 65) {
            result = 'B';
        } else if (average >= 55) {
            result = 'C';
        } else if (average >= 45) {
            result = 'D';
        } else {
            result = 'F';
        }

        return result;
    }

    String[] getSubjectResult() {
        String[] subjectResult = new String[this.marks.length];

        for (int i = 0; i < this.marks.length; i++) {
            if (this.marks[i] >= 35) {
                subjectResult[i] = "Pass";
            } else {
                subjectResult[i] = "Fail";
            }
        }

        return subjectResult;
    }


	void display(){
		String[] subjectResult = getSubjectResult();

		System.out.println("Student ID   : " + id);
		System.out.println("Student Name : " + name);


		for (int i = 0; i < marks.length; i++) {
			System.out.println(
				"Subject " + (i + 1) + " : " + marks[i]
				+ " - " + subjectResult[i]
			);
		}

	   
			System.out.println("Total   : " + calctotal());
			System.out.println("Average: " + calcavg());
			System.out.println("Grade   : " + getResult(calcavg()));

		}
}
