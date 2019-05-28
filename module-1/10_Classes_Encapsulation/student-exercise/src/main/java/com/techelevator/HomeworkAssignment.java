package com.techelevator;

public class HomeworkAssignment {

	private int totalMarks;
	private int possibleMarks;
	private String submitterName;
	
	private String letterGrade() {
		if (possibleMarks / totalMarks >= (0.9)) {
			return "A";
		} else if ((possibleMarks / totalMarks) > (0.8) && < (0.9) ) {
			return "B";
		} else if 
		
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
		return letterGrade;
	}

	
}
