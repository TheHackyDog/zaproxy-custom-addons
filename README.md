# ZAP Custom Add-ons

A collection of custom [Zaproxy](https://www.zaproxy.org/) add-ons for web security testing.

---

## Add-ons

### [WSTG Mapper](addOns/wstgmapper/)

Maps ZAP alerts to the [OWASP Web Security Testing Guide (WSTG)](https://owasp.org/www-project-web-security-testing-guide/) and provides a persistent compliance dashboard directly inside the ZAP workbench.

**Key features**

- Full WSTG checklist (all categories, all tests) loaded from the bundled JSON
- **Update Checklist** button — fetches the latest checklist live from OWASP GitHub
- Automatic mapping of ZAP scan alerts to WSTG test IDs
- Per-test status tracking: Passed / Failed / Manual Review / Not Applicable / Not Tested
- Tester notes saved per test and persisted with the ZAP session
- Tech-stack detection filter — shows only tests relevant to detected technologies
- Category and test-level filtering, search, expand/collapse
- Coverage progress bar with category completion stats
- Export to Markdown and CSV (full report or single category)
- Session-backed persistence — state survives ZAP restarts

**Screenshots**

| | |
|---|---|
![Dashboard overview](addOns/wstgmapper/docs/screenshots/dashboard-overview.png)

The main dashboard lists every WSTG category and test. Categories show a completion ratio (e.g. `2/10`) and expand on click to reveal individual tests. The right-hand panel shows the selected test's objectives, status, notes, and reference link. The coverage bar at the top tracks overall progress across all categories.

![Triggered tests](addOns/wstgmapper/docs/screenshots/triggered.png)
*"Triggered Only" filter — WSTG tests automatically mapped from ZAP scan alerts.*

![CSV export](addOns/wstgmapper/docs/screenshots/csv.png)
*CSV export of the full checklist — includes category, test ID, name, status, auto-detected flag, triggered flag, and tester notes.*

---

## Installation

### From a release (recommended)

1. Download the latest `.zap` file from the [Releases](../../releases) page.
2. In ZAP: **File → Load Add-on file** → select the `.zap` file.

### Build from source

Requirements: Java 17+, no local Gradle installation needed (wrapper included).

```bash
git clone https://github.com/thehackydog/zaproxy-custom-addons.git
cd zaproxy-custom-addons

# Build a specific add-on
./gradlew :addOns:wstgmapper:jarZapAddOn

# The packaged add-on will be at:
# addOns/wstgmapper/build/zapAddOn/bin/wstgmapper-alpha-<version>.zap
```

---

## Requirements

| Requirement | Version |
|---|---|
| Java | 17+ |
| OWASP ZAP | 2.15+ |
| commonlib add-on | >= 1.38.0 |

---

## Author

**Theodoros Vartamtzidis**

---

## License

Licensed under the [Apache License 2.0](LICENSE).
