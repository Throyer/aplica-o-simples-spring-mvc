/*
 * Copyright (C) 2019 Renato Henrique
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.github.throyer.Base.util;

/**
 *
 * @author Renato Henrique
 */
public class Templates {

    private static final String basePath = "views/";

    /**
     * Login.
     *
     * @see pagina com o formulario de login.
     * @since 1.0.0.RELEASE
     */
    public static final String LOGIN = basePath + "login";

    /**
     * Home.
     *
     * @see pagina inicial.
     * @since 1.0.0.RELEASE.
     */
    public static final String INDEX = basePath + "index";

    /**
     * Contact.
     *
     * @see pagina de contato.
     * @since 1.0.0.RELEASE.
     */
    public static final String CONTACT = basePath + "contact";

    /**
     * User.
     *
     * @see pagina de usuario.
     * @since 1.0.0.RELEASE.
     */
    public static final String USER = basePath + "user";
}
