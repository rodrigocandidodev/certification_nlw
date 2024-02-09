package com.rodrigocandidodev.certification_nlw.modules.students.entities;

import java.util.List;
import java.util.UUID;

public class CertificationStudentEntity{
	private UUID id;
	private UUID studentID;
	private String technology;
	private int grade;
	private List<AnswersCertificationsEntity> AnswersCertificationsEntity;
}