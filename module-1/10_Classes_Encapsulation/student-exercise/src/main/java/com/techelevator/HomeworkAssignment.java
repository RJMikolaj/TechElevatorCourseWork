package com.techelevator;

public class HomeworkAssignment {

	private int totalMarks;
	private int possibleMarks = 100;
	private String submitterName;
	
	public HomeworkAssignment (int possibleMarks) {
	}

	public String letterGrade() {
		if (possibleMarks / totalMarks >= (0.90)) {
			return "A";
		} else if (possibleMarks / totalMarks >= (0.80)) {
			return "B";
		} else if (possibleMarks / totalMarks > (0.69) && possibleMarks / totalMarks < (0.80)) {
			return "C";
		} else if (possibleMarks / totalMarks > (0.59) && possibleMarks / totalMarks < (0.70)) {
			return "D";
		} else if (possibleMarks / totalMarks < 0.60) {
			return "F";

		}
		return letterGrade();

	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public String getSubmitterName() {
		return submitterName;
	}

	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}

	public int getPossibleMarks() {
		return possibleMarks;
	}

	public String getLetterGrade() {
		return letterGrade();
	}

}
