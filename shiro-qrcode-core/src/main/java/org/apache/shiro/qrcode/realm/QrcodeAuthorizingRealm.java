package org.apache.shiro.qrcode.realm;

import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.biz.realm.AbstractAuthorizingRealm;
import org.apache.shiro.qrcode.token.QrcodeAuthenticationToken;

/**
 * Qrcode AuthorizingRealm
 * @author <a href="https://github.com/loong10k">Loong Wan</a>
 * @since 1.0.0
 */
public class QrcodeAuthorizingRealm extends AbstractAuthorizingRealm {

	@Override
	/**
	 * Returns the authentication token class.
	 *
	 * @return the authentication token class
	 */
	public Class<? extends AuthenticationToken> getAuthenticationTokenClass() {
		return QrcodeAuthenticationToken.class;
	}

}
