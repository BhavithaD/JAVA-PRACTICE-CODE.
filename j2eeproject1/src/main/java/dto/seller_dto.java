package dto;

import java.util.Objects;

public class seller_dto {
private int s_id;
private String s_name;
private String s_email;
private long s_contact;
private String s_password;
public int getS_id() {
	return s_id;
}
public void setS_id(int s_id) {
	this.s_id = s_id;
}
public String getS_name() {
	return s_name;
}
public void setS_name(String s_name) {
	this.s_name = s_name;
}
public String getS_email() {
	return s_email;
}
public void setS_email(String s_email) {
	this.s_email = s_email;
}
public long getS_contact() {
	return s_contact;
}
public void setS_contact(long s_contact) {
	this.s_contact = s_contact;
}
public String getS_password() {
	return s_password;
}
public void setS_password(String s_password) {
	this.s_password = s_password;
}
@Override
public int hashCode() {
	return Objects.hash(s_email, s_password);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	seller_dto other = (seller_dto) obj;
	return Objects.equals(s_email, other.s_email) && Objects.equals(s_password, other.s_password);
}


}
