package jp.gihyo.jenkinsbook.dto;

import java.io.Serializable;

/**
 * DTO class for SampleServlet.
 */
public class SampleDTO implements Serializable {
    /**
     * First name of the user.
     */
    private String firstName;
    /**
     * Last name of the user.
     */
    private String lastName;
    /**
     * Greeting message.
     */
    private String message;

    /**
     * Store the user name.
     * @param firstNameX first name of the user
     * @param lastNameX last name of the user
     */
    public SampleDTO(final String firstNameX, final String lastNameX) {
        this.setFirstName(firstNameX);
        this.setLastName(lastNameX);
        this.setMessage("Hello");
    }

    /**
     * Get first name of the user.
     * @return first name of the user
     */
    public final String getFirstName() {
        return this.firstName;
    }

    /**
     * Get last name of the user.
     * @return last name of the user
     */
    public final String getLastName() {
        return this.lastName;
    }

    /**
     * Get greeting message.
     * @return greeting message
     */
    public final String getMessage() {
        return this.message;
    }

    /**
     * Set first name of the user.
     * @param firstName first name of the user
     */
    public final void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    /**
     * Set last name of the user.
     * @param lstName last name of the user
     */
    public final void setLastName(final String lstName) {
        this.lastName = lstName;
    }

    /**
     * Set greeting message.
     * @param msg greeting message
     */
    public final void setMessage(final String msg) {
        this.message = msg;
    }
}
