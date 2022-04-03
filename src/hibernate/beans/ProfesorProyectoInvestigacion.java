/**
 * 
 */
package hibernate.beans;

/**
 * @author Jonatan
 *
 */
public class ProfesorProyectoInvestigacion {

	private String idProfesorProyectoInvestigacion;
	private String rol;
	private String profesorNumeroEconomico;
	private String proyectoInvestigacionIdProyectoInvestigacion;

	public ProfesorProyectoInvestigacion() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idProfesorProyectoInvestigacion
	 * @param rol
	 * @param profesorNumeroEconomico
	 * @param proyectoInvestigacionIdProyectoInvestigacion
	 */
	public ProfesorProyectoInvestigacion(String idProfesorProyectoInvestigacion, String rol,
			String profesorNumeroEconomico, String proyectoInvestigacionIdProyectoInvestigacion) {
		super();
		this.idProfesorProyectoInvestigacion = idProfesorProyectoInvestigacion;
		this.rol = rol;
		this.profesorNumeroEconomico = profesorNumeroEconomico;
		this.proyectoInvestigacionIdProyectoInvestigacion = proyectoInvestigacionIdProyectoInvestigacion;
	}

	/**
	 * @return the idProfesorProyectoInvestigacion
	 */
	public String getIdProfesorProyectoInvestigacion() {
		return idProfesorProyectoInvestigacion;
	}

	/**
	 * @param idProfesorProyectoInvestigacion the idProfesorProyectoInvestigacion to
	 *                                        set
	 */
	public void setIdProfesorProyectoInvestigacion(String idProfesorProyectoInvestigacion) {
		this.idProfesorProyectoInvestigacion = idProfesorProyectoInvestigacion;
	}

	/**
	 * @return the rol
	 */
	public String getRol() {
		return rol;
	}

	/**
	 * @param rol the rol to set
	 */
	public void setRol(String rol) {
		this.rol = rol;
	}

	/**
	 * @return the profesorNumeroEconomico
	 */
	public String getProfesorNumeroEconomico() {
		return profesorNumeroEconomico;
	}

	/**
	 * @param profesorNumeroEconomico the profesorNumeroEconomico to set
	 */
	public void setProfesorNumeroEconomico(String profesorNumeroEconomico) {
		this.profesorNumeroEconomico = profesorNumeroEconomico;
	}

	/**
	 * @return the proyectoInvestigacionIdProyectoInvestigacion
	 */
	public String getProyectoInvestigacionIdProyectoInvestigacion() {
		return proyectoInvestigacionIdProyectoInvestigacion;
	}

	/**
	 * @param proyectoInvestigacionIdProyectoInvestigacion the
	 *                                                     proyectoInvestigacionIdProyectoInvestigacion
	 *                                                     to set
	 */
	public void setProyectoInvestigacionIdProyectoInvestigacion(String proyectoInvestigacionIdProyectoInvestigacion) {
		this.proyectoInvestigacionIdProyectoInvestigacion = proyectoInvestigacionIdProyectoInvestigacion;
	}

	@Override
	public String toString() {
		return "ProfesorProyectoInvestigacion= " + idProfesorProyectoInvestigacion + ", " + rol + ", "
				+ profesorNumeroEconomico + ", " + proyectoInvestigacionIdProyectoInvestigacion;
	}
}
