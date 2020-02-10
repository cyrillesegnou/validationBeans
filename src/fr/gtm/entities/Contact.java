package fr.gtm.entities;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Contact {
	
	@NotNull
	@Size(min = 1, max=3)
	String civilite ;
	
	@NotNull
	@Size(max = 50)
	String nom ;

	@NotNull
	@Size(max = 50)
	String prenom ;
	
	@Min(0)
	@Max(120)
	int age ;
	

}
