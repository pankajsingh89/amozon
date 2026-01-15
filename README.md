# Amazon Login Automation Hybrid Framework

This project is a hybrid automation framework for the Amazon India login page using Selenium, Java, Cucumber, JUnit, and Maven. The folder structure follows industry standards for maintainability and scalability.

## Prerequisites

- **Java**: JDK 11 or higher
- **Maven**: 3.6.0 or higher
- **Git**: For version control
- **Chrome Browser**: For test execution

## Installation & Setup

1. **Clone the Repository**
   ```bash
   git clone https://github.com/yourusername/automation-amazon.git
   cd automation-amazon
   ```

2. **Install Dependencies**
   ```bash
   mvn clean install
   ```

3. **Run Tests**
   ```bash
   mvn clean test
   ```

## Project Structure

```
automation-amazon/
├── pom.xml
├── README.md
├── .gitignore
├── src/
│   └── test/
│       ├── java/
│       │   └── com/
│       │       └── amazon/
│       │           ├── pages/
│       │           │   ├── HomePage.java
│       │           │   └── LoginPage.java
│       │           ├── runners/
│       │           │   └── RunCucumberTest.java
│       │           ├── steps/
│       │           │   └── LoginSteps.java
│       │           └── utils/
│       │               ├── DriverManager.java
│       │               └── TestUtil.java
│       └── resources/
│           ├── features/
│           │   └── login.feature
│           └── cucumber.properties
└── target/
    ├── cucumber-report.html
    └── extent-report.html
```

## Framework Components

### Pages (Page Object Model)
- **HomePage.java**: Handles Amazon homepage interactions
- **LoginPage.java**: Handles login page interactions and validations

### Steps (BDD Cucumber)
- **LoginSteps.java**: Step definitions for login feature tests

### Utilities
- **DriverManager.java**: Manages WebDriver initialization and teardown
- **TestUtil.java**: Contains reusable utility methods and reporting setup

### Runners
- **RunCucumberTest.java**: JUnit runner for Cucumber tests

### Features (BDD Scenarios)
- **login.feature**: Contains Cucumber scenarios for login testing

## Test Scenarios

### Scenario 1: Navigate to Sign-in Page
- Opens Amazon India homepage
- Clicks on Sign in button
- Verifies sign-in page is displayed

### Scenario 2: Sign in with Email and Password
- Opens Amazon India homepage
- Clicks on Sign in button
- Enters mobile number/email (8506802690)
- Clicks Continue button
- Verifies password field
- Enters password
- Clicks Sign In button

## Reports Generated

The framework generates:
- **Extent Report**: `target/extent-report.html`
- **Cucumber Report**: `target/cucumber-report.html`

## Git & GitHub Workflow

### Initial Setup
```bash
git add .
git commit -m "Initial commit: Amazon automation framework setup"
git branch -M main
git remote add origin https://github.com/yourusername/automation-amazon.git
git push -u origin main
```

### Regular Workflow
```bash
# Create a feature branch
git checkout -b feature/add-new-page

# Make changes and commit
git add src/
git commit -m "Add new page object: [Page Name]"

# Push to GitHub
git push origin feature/add-new-page

# Create Pull Request on GitHub
```

## Best Practices

1. **Commit Frequently**: Make small, logical commits
2. **Meaningful Messages**: Use clear commit messages
3. **Feature Branches**: Create branches for new features
4. **Code Review**: Use Pull Requests before merging
5. **Ignore Files**: Keep `.gitignore` updated
6. **Versioning**: Tag releases on GitHub

## Troubleshooting

- **Tests Failing**: Check ChromeDriver version matches Chrome browser version
- **Element Not Found**: Verify page locators with browser inspection tools
- **Build Issues**: Run `mvn clean install` to resolve dependency issues

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/YourFeature`)
3. Commit your changes (`git commit -am 'Add YourFeature'`)
4. Push to the branch (`git push origin feature/YourFeature`)
5. Create a Pull Request

## License

This project is licensed under the MIT License - see LICENSE file for details.

## Author

Your Name - [your-email@example.com](mailto:your-email@example.com)

## Support

For issues or questions, please create an issue on GitHub.

- Create new feature files in `features/`
