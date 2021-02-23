package ferie.todoapp.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "tasks")
public class Task {
		@Id
		private int id;

		@Column(name = "desc")
		private String description;


		private boolean done;

}
