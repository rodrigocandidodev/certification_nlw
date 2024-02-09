package com.rodrigocandidodev.certification_nlw.modules.students.entities;

import java.util.List;
import java.util.UUID;

public class AnswersCertificationsEntity{
	private UUID id;
	private UUID certificationID;
	private UUID studentID;
	private UUID questionID;
	private UUID answerID;
	private boolean isCorrect;
}