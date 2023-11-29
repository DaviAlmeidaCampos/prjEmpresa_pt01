package com.Dave.Prjempresa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

public class Departamento {
	@Entity
	@Table(name = "db_Departamento")

	public class departamento {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long DepCodigo;
		@Size(max = 50)
		private String Varchar;
		
		

		public Long getDepCodigo() {
			return DepCodigo;
		}

		public void setDepCodigo(Long DepCodigo) {
			this.DepCodigo = DepCodigo;
		}

		public String getVarchar() {
			return Varchar;
		}

		public void setVarchar(String Varchar) {
			this.Varchar = Varchar;
		}

	}
}
