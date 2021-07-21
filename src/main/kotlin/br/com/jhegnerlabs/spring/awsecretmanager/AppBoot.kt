package br.com.jhegnerlabs.spring.awsecretmanager

//import com.amazonaws.services.secretsmanager.AWSSecretsManagerClientBuilder
//import com.amazonaws.services.secretsmanager.model.*
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean


@SpringBootApplication
class AppBoot {

	@Bean
	fun applicationRunner(
		@Value("\${password1}") password1: String?,
		@Value("\${password2}") password2: String?
	): ApplicationRunner? {
		return ApplicationRunner {
			println(password1)
			println(password2)
		}
	}

}

fun main(args: Array<String>) {
	runApplication<AppBoot>(*args)
}