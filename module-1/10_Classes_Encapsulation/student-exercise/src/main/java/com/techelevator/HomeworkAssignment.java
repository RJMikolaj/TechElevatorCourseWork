package com.techelevator;

public class HomeworkAssignment {

	private int totalMarks = 0;
	private int possibleMarks = 100;
	private String submitterName;
	private String letterGrade;

	public HomeworkAssignment(int possibleMarks) {
		this.possibleMarks = possibleMarks;
	}
	
	   public String getLetterGrade() {
	        double percentage = (double) totalMarks / possibleMarks;
	        if (percentage >= 0.9) {
	            return "A";
	        } else if (percentage >= 0.8) {
	            return "B";
	        } else if (percentage >= 0.7) {
	            return "C";
	        } else if (percentage >= 0.6) {
	            return "D";
	        } else {
	            return "F";
	        }
	    }
	
//	public String letterGrade() {
//		String result = "";
//		if (possibleMarks / totalMarks >= (0.9)) {
//			result = "A";
//		} else if (possibleMarks / totalMarks >= (0.8)) {
//			result = "B";
//		} else if (possibleMarks / totalMarks >= (0.7)) {
//			result = "C";
//		} else if (possibleMarks / totalMarks >= (0.6)) {
//			result = "D";
//		} else if (possibleMarks / totalMarks < 0.6) {
//			result = "F";
//
//		}
//		return result;
//
//	}

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


}
