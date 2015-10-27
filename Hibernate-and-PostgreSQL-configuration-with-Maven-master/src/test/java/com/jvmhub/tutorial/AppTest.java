package com.jvmhub.tutorial;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Locale;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jvmhub.tutorial.entity.AppUser;
import com.jvmhub.tutorial.entity.MonopolyMoney;
import com.jvmhub.tutorial.entity.PayType;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

	public void testApp() {
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		AppUser user = new AppUser("firstuser");
		user.setFirstName("joee");
		BigDecimal expenseAmt = new BigDecimal("1234");
		user.setExpenseAmt(expenseAmt );
		user.setExpenseCCY( Currency.getInstance(Locale.UK));
		user.setPlayMoney(new MonopolyMoney( "1234","UK") );
		user.setPayType(PayType.BPAY);
		session.save(user);

		session.getTransaction().commit();
		session.close();
	}
}
