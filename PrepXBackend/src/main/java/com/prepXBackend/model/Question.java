package com.prepXBackend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "questions")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String category;
	private String difficulty;
	private String questionText;
	private String optionA;
	private String optionB;
	private String optionC;
	private String optionD;
	private String correctAnswer;

	public Question(String category, String difficulty, String questionText,
					String optionA, String optionB, String optionC, String optionD, String correctAnswer) {
		this.category = category;
		this.difficulty = difficulty;
		this.questionText = questionText;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.correctAnswer = correctAnswer;
	}
}
